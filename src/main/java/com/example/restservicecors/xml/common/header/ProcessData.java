package com.example.restservicecors.xml.common.header;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.example.restservicecors.xml.common.ProcessDetail;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class ProcessData {
	@XmlElementWrapper(name = "DetalleProcesos")
	@XmlElement(name = "DetalleProceso")
	private List<ProcessDetail> details;
}
