package com.example.restservicecors.xml.policy.individual;

import com.example.restservicecors.xml.person.Person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InsuredPerson {
	private Person person;
}
