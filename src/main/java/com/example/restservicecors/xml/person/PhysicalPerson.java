package com.example.restservicecors.xml.person;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.example.restservicecors.xml.person.common.Address;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@XmlRootElement(name = "PersonaFisica")
@XmlType(name = "PersonaFisica")
public class PhysicalPerson extends Person {

	@XmlElement(name = "Nombre")
	private String name;

	@XmlElement(name = "Apellido1")
	private String firstSurname;

	@XmlElement(name = "Sexo")
	private String gender;

	@XmlElement(name = "Domicilio")
	private Address address;

	@XmlElement(name = "FechaNacimiento")
	private LocalDateTime birthday;

}
