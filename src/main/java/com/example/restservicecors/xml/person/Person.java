package com.example.restservicecors.xml.person;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	@JacksonXmlProperty(localName = "TipoIdentificacion")
	private String typeIdentification;
	
	@JacksonXmlProperty(localName = "IdPersona")
	private String personalId;
}
