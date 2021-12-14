package com.example.restservicecors.xml.common.header;

import java.time.LocalDateTime;

import com.example.restservicecors.xml.common.Codes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class Header {
	@JacksonXmlProperty(localName = "FechaCreacion")
	private LocalDateTime createdDate;
	@JacksonXmlProperty(localName = "Version")
	private double version;
	@JacksonXmlProperty(localName = "Emisor")
	private Codes sender;
	@JacksonXmlProperty(localName = "Receptor")
	private Codes receiver;
	@JacksonXmlProperty(localName = "DatosProcesos")
	private ProcessData data;
}
