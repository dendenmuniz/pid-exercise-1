package com.sda.pid.exercise1.repository;


import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.sda.pid.exercise1.model.Products;

public class ProductsRepository {
	
	public Products retrieveProducts() {
		
		try {
			File file = new File(getClass().getClassLoader().getResource("bars.xml").getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			return (Products) jaxbUnmarshaller.unmarshal(file);
			
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}

	}
}