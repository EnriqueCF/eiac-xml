package com.example.restservicecors.xml.policy.common;

import javax.xml.bind.annotation.XmlElement;

import com.example.restservicecors.xml.common.Codes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MediatorData {

	@XmlElement(name = "IdMediador")
	private Codes mediatorId;
}
