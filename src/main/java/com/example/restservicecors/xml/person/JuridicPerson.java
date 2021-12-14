package com.example.restservicecors.xml.person;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "ProcesosEIAC")
public class JuridicPerson extends Person {
	@JacksonXmlProperty(localName = "RazonSocial")
	private String comercialName;
}
