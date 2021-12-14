package com.example.restservicecors.xml.policy.common;

import com.example.restservicecors.xml.common.Codes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MediatorData {
	
	@JacksonXmlProperty(localName = "IdMediador")
	private Codes mediatorId;
}
