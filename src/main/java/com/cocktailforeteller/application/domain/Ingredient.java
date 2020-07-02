package com.cocktailforeteller.application.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;

@Entity
@Getter
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	private String abv;
	private boolean alcoholic;

	@ManyToOne
	@JoinColumn(name = "drink_id", nullable = false)
	private Drink drink;
}
