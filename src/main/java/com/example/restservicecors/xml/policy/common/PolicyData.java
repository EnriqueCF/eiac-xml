package com.example.restservicecors.xml.policy.common;

import java.util.List;

import com.example.restservicecors.xml.common.Codes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PolicyData {
	@JacksonXmlProperty(localName = "IdPoliza")
	private String policyId;
	
	@JacksonXmlProperty(localName = "CodigoEntidad")
	private Codes entityCode;
	
	@JacksonXmlElementWrapper(localName = "DatosMediador")
	@JacksonXmlProperty(localName = "IdMediador")
	private List<Codes> mediatorsData;
}
