package com.example.restservicecors.xml.person;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@XmlRootElement
@XmlSeeAlso({ JuridicPerson.class, PhysicalPerson.class })
public class Person {
	@XmlElement(name = "TipoIdentificacion")
	private String typeIdentification;

	@XmlElement(name = "IdPersona")
	private String personalId;
}
