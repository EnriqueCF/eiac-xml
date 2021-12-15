package com.example.restservicecors.xml.policy;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.restservicecors.xml.common.ProcessDetail;
import com.example.restservicecors.xml.policy.common.Dates;
import com.example.restservicecors.xml.policy.common.PaymentManagment;
import com.example.restservicecors.xml.policy.common.PolicyData;
import com.example.restservicecors.xml.policy.common.PolicyHolder;
import com.example.restservicecors.xml.policy.common.RiskData;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@XmlRootElement
public class Policy {
	@XmlElement(name = "DetalleProceso")
	private ProcessDetail processDetail;

	@XmlElement(name = "DatosPoliza")
	private PolicyData policyData;

	@XmlElement(name = "SituacionPoliza")
	private String status;

	@XmlElement(name = "ClasePoliza")
	private String policyClass;

	@XmlElement(name = "Fechas")
	private Dates dates;

	@XmlElement(name = "DuracionPoliza")
	private String duration;

	@XmlElement(name = "DatosRiesgos")
	private RiskData riskData;

	@XmlElement(name = "GestionCobro")
	private PaymentManagment paymentManagment;

	@XmlElement(name = "Tomador")
	private PolicyHolder policyHolder;
}