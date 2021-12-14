package com.example.restservicecors.xml.common.header;

import java.util.List;

import com.example.restservicecors.xml.common.ProcessDetail;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class ProcessData {
	@JacksonXmlElementWrapper(localName = "DetalleProcesos")
	@JacksonXmlProperty(localName = "DetalleProceso")
	private List<ProcessDetail> details;
}
