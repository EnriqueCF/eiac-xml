package com.example.restservicecors.xml.policy;

import java.util.List;

import com.example.restservicecors.xml.policy.individual.InsuredPerson;
import com.example.restservicecors.xml.policy.individual.Origin;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IndividualPolicy extends Policy {

	@JacksonXmlProperty(localName = "Asegurado")
	private InsuredPerson insured;

	@JacksonXmlElementWrapper(localName = "OrigenesContratacion")
	@JacksonXmlProperty(localName = "OrigenContratacion")
	private List<Origin> origins;
}
