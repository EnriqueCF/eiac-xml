package com.example.restservicecors.xml.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class Codes {
	@JacksonXmlProperty(localName = "CodigoInterno")
	private String internalCode;
	
	@JacksonXmlProperty(localName = "CodigoDGS")
	private String dgsCode;
}
