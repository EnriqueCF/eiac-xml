package com.example.restservicecors.xml.person;

import java.time.LocalDateTime;

import com.example.restservicecors.xml.person.common.Address;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalPerson extends Person {

	@JacksonXmlProperty(localName = "Nombre")
	private String name;
	
	@JacksonXmlProperty(localName = "Apellido1")
	private String firstSurname;
	
	@JacksonXmlProperty(localName = "Sexo")
	private String gender;
	
	@JacksonXmlProperty(localName = "Domicilio")
	private Address address;
	
	@JacksonXmlProperty(localName = "FechaNacimiento")
	private LocalDateTime birthday;

}
