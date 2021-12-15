package com.example.restservicecors.xml.policy.individual;

import javax.xml.bind.annotation.XmlElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Origin {
	@XmlElement(name = "PersonaJuridica")
	private Integer orderNumber;

	@XmlElement(name = "PersonaJuridica")
	private String hiringClass;

	@XmlElement(name = "PersonaJuridica")
	private String centerCode;
}
