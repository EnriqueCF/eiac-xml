package com.example.restservicecors.xml.policy.common;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.example.restservicecors.xml.common.Codes;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class PolicyData {
	@XmlElement(name = "IdPoliza")
	private String policyId;

	@XmlElement(name = "CodigoEntidad")
	private Codes entityCode;

	@XmlElementWrapper(name = "DatosMediador")
	@XmlElement(name = "IdMediador")
	private List<Codes> mediatorsData;
}
