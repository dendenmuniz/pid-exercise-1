package com.sda.pid.exercise1.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="products")
public class Products {
	
	private List<Bar> bar;

	public List<Bar> getBar() {
		return bar;
	}

	public void setBar(List<Bar> bar) {
		this.bar = bar;
	}
	
	
	
	
	

}
