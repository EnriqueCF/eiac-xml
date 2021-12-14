package com.example.restservicecors.xml.policy.common;

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
public class Dates {
	@JacksonXmlProperty(localName = "FechaSituacion")
	private LocalDateTime situation;
	@JacksonXmlProperty(localName = "FechaEfectoInicial")
	private LocalDateTime initial;
	@JacksonXmlProperty(localName = "FechaEfectoActual")
	private LocalDateTime actual;
	@JacksonXmlProperty(localName = "FechaVencimiento")
	private LocalDateTime expiration;
	@JacksonXmlProperty(localName = "FechaFinSeguro")
	private LocalDateTime endDemand;
	@JacksonXmlProperty(localName = "FechaSolicitud")
	private LocalDateTime issue;
	@JacksonXmlProperty(localName = "FechaEmision")
	private LocalDateTime emited;
}
