package com.cocktailforeteller.application.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Drink {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String idDrink;

	@Column(nullable = false)
	private String name;

	@Column
	private String alternateName;

	@Column(nullable = false)
	private String organization;

	@Column(nullable = false)
	private String category;

	@Column(nullable = false)
	private String alcoholic;

	@Column(nullable = false)
	private String glassType;

	@Column(nullable = false)
	private String instruction;

	@Column
	private String drinkThumb;

	@OneToMany(mappedBy = "drink")
	private List<Ingredient> ingredient;

	@OneToMany(mappedBy = "drink")
	private List<Measure> measure;

}
