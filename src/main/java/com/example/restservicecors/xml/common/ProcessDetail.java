package com.example.restservicecors.xml.common;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.example.restservicecors.xml.config.LocalDateTimeAdapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProcessDetail {
	@XmlElement(name = "ClasePoliza")
	private String policyClass;

	@XmlElement(name = "Transaccion")
	private String transaction;

	@XmlElement(name = "Periodo")
	private String period;

	@XmlElement(name = "FechaDesde")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime from;

	@XmlElement(name = "FechaHasta")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime to;
}
