package com.example.restservicecors.xml.policy;

import javax.xml.bind.annotation.XmlElement;

import com.example.restservicecors.xml.policy.colective.CollectiveData;
import com.example.restservicecors.xml.policy.colective.ProfitShare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CollectivePolicy extends Policy {

	@XmlElement(name = "ParticipacionBeneficios")
	private CollectiveData collectivePolicyData;

	@XmlElement(name = "DatosPolizaColectiva")
	private ProfitShare profitShare;
}