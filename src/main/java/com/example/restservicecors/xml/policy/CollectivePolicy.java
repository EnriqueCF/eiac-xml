package com.example.restservicecors.xml.policy;

import com.example.restservicecors.xml.policy.colective.CollectiveData;
import com.example.restservicecors.xml.policy.colective.ProfitShare;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CollectivePolicy extends Policy{

	@JacksonXmlProperty(localName = "ParticipacionBeneficios")
	private CollectiveData collectivePolicyData;
	
	@JacksonXmlProperty(localName = "DatosPolizaColectiva")
	private ProfitShare profitShare;
}