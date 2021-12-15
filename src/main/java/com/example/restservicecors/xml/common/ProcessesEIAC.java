package com.example.restservicecors.xml.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.example.restservicecors.xml.common.header.Header;

import lombok.Setter;

@Setter
public class ProcessesEIAC {

	private static final String SCHEMA = "http://www.tirea.es/EIAC/ProcesosEIAC ProcesosEIAC_V06.xsd";
	private static final String XMLNS = "http://www.tirea.es/EIAC/ProcesosEIAC";
	private static final String XSI = "http://www.w3.org/2001/XMLSchema-instance";

	@XmlAttribute(name = "xsi:schemaLocation")
	private String schemaField;

	@XmlAttribute(name = "xmlns")
	private String xmlnsField;

	@XmlAttribute(name = "xmlns:xsi")
	private String xsiField;

	@XmlElement(name = "Cabecera")
	private Header header;

	public ProcessesEIAC() {
		this.schemaField = SCHEMA;
		this.xmlnsField = XMLNS;
		this.xsiField = XSI;
	}

}
