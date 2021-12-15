package com.example.restservicecors.xml.policy;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.restservicecors.xml.policy.individual.InsuredPerson;
import com.example.restservicecors.xml.policy.individual.Origin;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@XmlRootElement(name = "Poliza")
@XmlAccessorType(XmlAccessType.FIELD)
public class IndividualPolicy extends Policy {

	@XmlElement(name = "Asegurado")
	private InsuredPerson insuredPerson;

	@XmlElementWrapper(name = "OrigenesContratacion")
	@XmlElement(name = "OrigenContratacion")
	private List<Origin> origins;
}
