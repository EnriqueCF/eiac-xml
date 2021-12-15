package com.example.restservicecors.xml.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.restservicecors.xml.policy.IndividualPolicy;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@XmlRootElement(name = "ProcesosEIAC")
public class ProcessesEiacPolicy extends ProcessesEIAC {
	@XmlElement(name = "Objeto")
	private IndividualPolicy individualPolicy;
}
