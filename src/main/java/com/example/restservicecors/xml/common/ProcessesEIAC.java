package com.example.restservicecors.xml.common;

import com.example.restservicecors.xml.common.header.Header;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JacksonXmlRootElement(localName = "ProcesosEIAC")
public class ProcessesEIAC {

	private static final String SCHEMA = "http://www.tirea.es/EIAC/ProcesosEIAC ProcesosEIAC_V06.xsd";
	private static final String XMLNS = "http://www.tirea.es/EIAC/ProcesosEIAC";
	private static final String XSI = "http://www.w3.org/2001/XMLSchema-instance";

	@JacksonXmlProperty(isAttribute = true, localName = "xsi:schemaLocation")
	private String schemaField;
	
	@JacksonXmlProperty(isAttribute = true, localName = "xmlns")
	private String xmlnsField;
	
	@JacksonXmlProperty(isAttribute = true, localName = "xmlns:xsi")
	private String xsiField;
	
	@JacksonXmlProperty(localName = "Cabecera")
	private Header header;

	public ProcessesEIAC() {
		this.schemaField = SCHEMA;
		this.xmlnsField = XMLNS;
		this.xsiField = XSI;
	}

}
