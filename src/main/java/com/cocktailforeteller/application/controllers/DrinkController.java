package com.cocktailforeteller.application.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/drink")
public class DrinkController {

	@PostMapping("/register")
	public void registerDrink() {

	}

}
