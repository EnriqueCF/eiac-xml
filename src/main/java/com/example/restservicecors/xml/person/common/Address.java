package com.example.restservicecors.xml.person.common;

import javax.xml.bind.annotation.XmlElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class Address {
	@XmlElement(name = "NombreVia")
	private String nameRoad;

	@XmlElement(name = "CodigoPostal")
	private Integer zipCode;

	@XmlElement(name = "Poblacion")
	private String population;

	@XmlElement(name = "Provincia")
	private Integer province;

	@XmlElement(name = "ClaseVia")
	private String classRoad;

	@XmlElement(name = "OtrosDatosVia")
	private String otherData;

	@XmlElement(name = "Pais")
	private String country;
}
