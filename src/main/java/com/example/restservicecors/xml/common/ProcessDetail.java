package com.example.restservicecors.xml.common;

import java.time.LocalDateTime;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProcessDetail {
	@JacksonXmlProperty(localName = "ClasePoliza")
	private String policyClass;
	
	@JacksonXmlProperty(localName = "Transaccion")
	private String transaction;
	
	@JacksonXmlProperty(localName = "Periodo")
	private String period;
	
	@JacksonXmlProperty(localName = "FechaDesde")
	private LocalDateTime from;
	
	@JacksonXmlProperty(localName = "FechaHasta")
	private LocalDateTime to;
}
