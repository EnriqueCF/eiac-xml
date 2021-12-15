package com.example.restservicecors.xml.common;

import javax.xml.bind.annotation.XmlElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class Codes {
    @XmlElement(name="CodigoInterno")
	private String internalCode;
	
    @XmlElement(name="CodigoDGS")
	private String dgsCode;
}
