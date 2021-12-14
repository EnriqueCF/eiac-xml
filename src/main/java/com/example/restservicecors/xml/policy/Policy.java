package com.example.restservicecors.xml.policy;

import com.example.restservicecors.xml.common.ProcessDetail;
import com.example.restservicecors.xml.person.Person;
import com.example.restservicecors.xml.policy.common.Dates;
import com.example.restservicecors.xml.policy.common.PaymentManagment;
import com.example.restservicecors.xml.policy.common.PolicyData;
import com.example.restservicecors.xml.policy.common.RiskData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Policy {
	@JacksonXmlProperty(localName = "DetalleProceso")
	private ProcessDetail processDetail;
	
	@JacksonXmlProperty(localName = "DatosPoliza")
	private PolicyData policyData;
	
	@JacksonXmlProperty(localName = "SituacionPoliza")
	private String status;
	
	@JacksonXmlProperty(localName = "ClasePoliza")
	private String policyClass;
	
	@JacksonXmlProperty(localName = "Fechas")
	private Dates dates;
	
	@JacksonXmlProperty(localName = "DuracionPoliza")
	private String duration;
	
	@JacksonXmlProperty(localName = "DatosRiesgos")
	private RiskData riskData;
	
	@JacksonXmlProperty(localName = "GestionCobro")
	private PaymentManagment paymentManagment;
	
	@JacksonXmlProperty( localName = "Tomador")
	private Person policyHolder;
}