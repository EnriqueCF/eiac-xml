package com.example.restservicecors.xml.policy.individual;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Origin {
	@JacksonXmlProperty(localName = "PersonaJuridica")
	private Integer orderNumber;
	
	@JacksonXmlProperty(localName = "PersonaJuridica")
	private String hiringClass;
	
	@JacksonXmlProperty(localName = "PersonaJuridica")
	private String centerCode;
}
