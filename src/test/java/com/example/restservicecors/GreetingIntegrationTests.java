package com.example.restservicecors;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.restservicecors.xml.common.Codes;
import com.example.restservicecors.xml.common.ProcessDetail;
import com.example.restservicecors.xml.common.ProcessesEiacPolicy;
import com.example.restservicecors.xml.common.header.Header;
import com.example.restservicecors.xml.common.header.ProcessData;
import com.example.restservicecors.xml.person.JuridicPerson;
import com.example.restservicecors.xml.person.PhysicalPerson;
import com.example.restservicecors.xml.person.common.Address;
import com.example.restservicecors.xml.policy.IndividualPolicy;
import com.example.restservicecors.xml.policy.common.Dates;
import com.example.restservicecors.xml.policy.common.PolicyData;
import com.example.restservicecors.xml.policy.common.PolicyHolder;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingIntegrationTests {

	@Test
	public void whenJavaSerializedToXmlFile_thenCorrect() throws IOException {
		log.info("{}", LocalDateTime.now());
		ProcessesEiacPolicy procesosEiac = new ProcessesEiacPolicy();

		// Headers
		Header header = new Header();
		header.setCreatedDate(LocalDateTime.now());
		Codes emisor = new Codes();
		emisor.setDgsCode("C0001");
		emisor.setInternalCode("EA01");
		header.setSender(emisor);

		Codes receptor = new Codes();
		receptor.setDgsCode("J0001");
		receptor.setInternalCode("ME01");
		header.setReceiver(receptor);
		header.setVersion(6.0);
		// Objetos
		
		ProcessData datosProcesos = new ProcessData();
		List<ProcessDetail> details = new ArrayList<>();
		// Detalle proceso
		ProcessDetail detail = new ProcessDetail();
		detail.setFrom(LocalDateTime.now());
		detail.setTo(LocalDateTime.now());
		detail.setPeriod("TR");
		detail.setTransaction("OR");
		detail.setPolicyClass("NP");
		details.add(detail);
		datosProcesos.setDetails(details);
		header.setData(datosProcesos);
		procesosEiac.setHeader(header);
		
		procesosEiac.setPolicy(buildIndividualPolicy());
		// Configuraci??n
		
		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
		xmlMapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, false);
		xmlMapper.registerModule(new ParameterNamesModule());
		xmlMapper.registerModule(new Jdk8Module());
		xmlMapper.registerModule(new JavaTimeModule());
		
		
		xmlMapper.writeValue(new File("simple_bean.xml"), procesosEiac);
		File file = new File("simple_bean.xml");

		log.info("{}", LocalDateTime.now());
		assertNotNull(file);
	}
	
	
	private IndividualPolicy buildIndividualPolicy() {
		// Poliza
		IndividualPolicy policy = new IndividualPolicy();
		policy.setPolicyClass("NP");
		policy.setStatus("EV");
		// Detalle proceso
		ProcessDetail detail = new ProcessDetail();
		detail.setFrom(LocalDateTime.now());
		detail.setTo(LocalDateTime.now());
		detail.setPeriod("TR");
		detail.setTransaction("OR");
		detail.setPolicyClass("NP");
		policy.setProcessDetail(detail);

		// DatosPoliza
		PolicyData datosPoliza = new PolicyData();
		datosPoliza.setPolicyId("P01");
		List<Codes> mediatosCodes = new ArrayList<>();
		Codes mediatorCode = new Codes();
		mediatorCode.setDgsCode("J0001");
		mediatorCode.setInternalCode("ME01");
		mediatosCodes.add(mediatorCode);
		Codes entityCode = new Codes();
		entityCode.setDgsCode("C0001");
		entityCode.setInternalCode("EA01");
		
		datosPoliza.setEntityCode(entityCode);
		datosPoliza.setMediatorsData(mediatosCodes);
		policy.setPolicyData(datosPoliza);
		
		// Fechas
		Dates fechas = new Dates();
		fechas.setSituation(LocalDateTime.now());
		fechas.setInitial(LocalDateTime.now());
		fechas.setActual(LocalDateTime.now());
		fechas.setEmited(LocalDateTime.now());
		fechas.setEndDemand(LocalDateTime.now());
		fechas.setExpiration(LocalDateTime.now());
		fechas.setInitial(LocalDateTime.now());
		fechas.setIssue(LocalDateTime.now());
		
		policy.setDates(fechas);
		policy.setDuration("RE");
		JuridicPerson personaJuridica = new JuridicPerson();
		personaJuridica.setComercialName("Raz??n Social");
		personaJuridica.setPersonalId("B00000001");
		personaJuridica.setTypeIdentification("NI");
		PolicyHolder tomador = new PolicyHolder();
		tomador.setJuridicPerson(personaJuridica);
		policy.setPolicyHolder(personaJuridica);
		
		PhysicalPerson person = new PhysicalPerson();
		person.setTypeIdentification("OT");
		person.setPersonalId("P00000001A");
		person.setName("Nombre");
		person.setFirstSurname("Apellido");
		person.setGender("MU");
		Address address = new Address();
		address.setNameRoad("Principal");
		address.setZipCode(05001);
		address.setClassRoad("Calle");
		address.setProvince(5);
		address.setPopulation("??vila");
		address.setOtherData("N??mero 1");
		address.setCountry("ESP");
		person.setAddress(address);
//		policy.setInsured(person);
		return policy;
	}
}
