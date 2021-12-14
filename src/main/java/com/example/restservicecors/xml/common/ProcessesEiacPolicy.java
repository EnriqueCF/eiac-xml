package com.example.restservicecors.xml.common;

import com.example.restservicecors.xml.policy.IndividualPolicy;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProcessesEiacPolicy extends ProcessesEIAC {

	@JacksonXmlElementWrapper(localName = "Objeto")
	@JacksonXmlProperty(localName = "Poliza")
	private IndividualPolicy policy;
}
