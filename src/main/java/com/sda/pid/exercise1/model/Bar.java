package com.sda.pid.exercise1.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class Bar {
	
    private Double fett;

    private Double fiber;

    private Double kolhydrat;

    private Review review;

    private Double protein;
   
    private String SN;

    private Double energy;

	public Double getFett() {
		return fett;
	}

	public void setFett(Double fett) {
		this.fett = fett;
	}

	public Double getFiber() {
		return fiber;
	}

	public void setFiber(Double fiber) {
		this.fiber = fiber;
	}

	public Double getKolhydrat() {
		return kolhydrat;
	}

	public void setKolhydrat(Double kolhydrat) {
		this.kolhydrat = kolhydrat;
	}

	public Review getReview() {
		return review;
	}
	
	public void setReview(Review review) {
		this.review = review;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public String getSN() {
		return SN;
	}
	@XmlAttribute(name="SN")
	public void setSN(String sN) {
		SN = sN;
	}

	public Double getEnergy() {
		return energy;
	}

	public void setEnergy(Double energy) {
		this.energy = energy;
	}
	
	
	

}
