package com.example.restservicecors.xml.policy.common;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RiskData {
	@JacksonXmlProperty(localName = "Riesgo")
	private List<Risk> risks;
}
