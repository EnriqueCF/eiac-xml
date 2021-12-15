package com.example.restservicecors.xml.policy.common;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RiskData {
	@XmlElement(name = "Riesgo")
	private List<Risk> risks;
}
