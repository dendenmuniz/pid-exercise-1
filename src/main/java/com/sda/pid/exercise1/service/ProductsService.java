package com.sda.pid.exercise1.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.google.common.collect.Comparators;
import com.sda.pid.exercise1.model.Bar;
import com.sda.pid.exercise1.model.Products;
import com.sda.pid.exercise1.repository.ProductsRepository;

public class ProductsService {

	private ProductsRepository repository;

	private Products products;

	public ProductsService() {
		repository = new ProductsRepository();
		products = repository.retrieveProducts();
	}

	public List<String> retrieveAllBarNames() {

		List<String> namesList = products.getBar().stream().map(Bar::getSN).collect(Collectors.toList());
		return namesList;
	}

	public List<Bar> sortByProtein() {

		Comparator<Bar> reverseComp = Collections.reverseOrder((o1, o2) -> o1.getProtein().compareTo(o2.getProtein()));
		Collections.sort(products.getBar(), reverseComp);

		return products.getBar();

	}

	public List<Bar> sortByFat() {
		Comparator<Bar> reverseComp = Collections.reverseOrder((o1, o2) -> o1.getFett().compareTo(o2.getFett()));
		Collections.sort(products.getBar(), reverseComp);

		return products.getBar();
	}

	public List<Bar> filterByFiber(Double fiberValue) {
		Predicate<Bar> byFiber = bar -> Double.valueOf(bar.getFiber()) <= fiberValue;

		var result = products.getBar().stream().filter(byFiber).collect(Collectors.toList());

		return result;
	}

	public List<Bar> filterByProteinAndReviewer(Double proteinValue, String reviewerValue) {
		Predicate<Bar> byProtein = bar -> Double.valueOf(bar.getProtein()) >= proteinValue;
		Predicate<Bar> byReviewer = bar -> bar.getReview() != null && bar.getReview().getReviewer() != null
				&& bar.getReview().getReviewer().stream()
						.anyMatch(reviewer -> reviewer.getPersonID().equalsIgnoreCase(reviewerValue));

		var result = products.getBar().stream().filter(byProtein).filter(byReviewer).collect(Collectors.toList());

		return result;
	}

}
