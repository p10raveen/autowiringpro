package com.developer.autowiringpro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	@Autowired
	@Qualifier("car1")
	Car car;
	Address add;
	
	
	public Person(Car car) {
		super();
		this.car = car;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Car getCar() {
		return car;
	}

	
	public void setCar(Car car) {
		this.car = car;
	}
	
}
