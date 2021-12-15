package com.example.restservicecors.xml.policy.common;

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
public class Dates {
	@XmlElement(name = "FechaSituacion")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime situation;
	@XmlElement(name = "FechaEfectoInicial")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime initial;
	@XmlElement(name = "FechaEfectoActual")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime actual;
	@XmlElement(name = "FechaVencimiento")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime expiration;
	@XmlElement(name = "FechaFinSeguro")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime endDemand;
	@XmlElement(name = "FechaSolicitud")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime issue;
	@XmlElement(name = "FechaEmision")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime emited;
}
