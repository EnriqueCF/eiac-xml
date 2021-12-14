package com.example.restservicecors.xml.person.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class Address {
	@JacksonXmlProperty(localName = "NombreVia")
	private String nameRoad;

	@JacksonXmlProperty(localName = "CodigoPostal")
	private Integer zipCode;

	@JacksonXmlProperty(localName = "Poblacion")
	private String population;

	@JacksonXmlProperty(localName = "Provincia")
	private Integer province;

	@JacksonXmlProperty(localName = "ClaseVia")
	private String classRoad;

	@JacksonXmlProperty(localName = "OtrosDatosVia")
	private String otherData;

	@JacksonXmlProperty(localName = "Pais")
	private String country;
}
