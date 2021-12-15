package com.example.restservicecors.xml.common.header;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.example.restservicecors.xml.common.Codes;
import com.example.restservicecors.xml.config.LocalDateTimeAdapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public final class Header {
	@XmlElement(name = "Fecha creacion")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime createdDate;
	@XmlElement(name = "Version")
	private double version;
	@XmlElement(name = "Emisor")
	private Codes sender;
	@XmlElement(name = "Receptor")
	private Codes receiver;
	@XmlElement(name = "DatosProcesos")
	private ProcessData data;
}
