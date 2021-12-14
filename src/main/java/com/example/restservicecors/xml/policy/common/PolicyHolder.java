package com.example.restservicecors.xml.policy.common;

import com.example.restservicecors.xml.person.JuridicPerson;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PolicyHolder {
	@JacksonXmlProperty(localName = "PersonaJuridica")
	private JuridicPerson juridicPerson;
}
