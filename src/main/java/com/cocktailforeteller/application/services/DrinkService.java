package com.cocktailforeteller.application.services;

import org.springframework.stereotype.Service;

import com.cocktailforeteller.application.repositories.DrinkRepository;

@Service
public class DrinkService {

	private final DrinkRepository repository;

	public DrinkService(DrinkRepository repository) {
		this.repository = repository;
	}

}
