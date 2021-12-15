package com.example.restservicecors.xml.person;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@XmlRootElement(name = "PersonaJuridica")
@XmlType(name = "PersonaJuridica")
public class JuridicPerson extends Person {
	@XmlElement(name = "RazonSocial")
	private String comercialName;
}
