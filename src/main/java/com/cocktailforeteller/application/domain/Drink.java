package com.cocktailforeteller.application.domain;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Getter
@Entity
@Builder
@NoArgsConstructor
@Table(name = "drink")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Drink {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "cocktail_name", nullable = false)
	private String name;

	@Column(name = "bartender_name")
	private String bartender;

	@Column(name = "barcompany")
	private String barName;

	private String location;

	@Column(nullable = false)
	private String ingredients;
	private String garnish;
	private String glassType;
	private String preparation;
	private String notes;
	private String drinkThumb;

	public Drink(
			UUID id,
			String name,
			String bartender,
			String barName,
			String location,
			String ingredients,
			String garnish,
			String glassType,
			String preparation,
			String notes,
			String drinkThumb
	) {
		guardIsValidName( name );
		guardIsValidAlternateName( garnish );
		guardIsValidCategory( notes );
		guardIsValidIngredient( ingredients );
		guardIsValidGlassType( glassType );
		guardIsValidInstruction( preparation );
		guardIsValidDrinkThumb( drinkThumb );

		this.id = id;
		this.name = name;
		this.bartender = bartender;
		this.barName = barName;
		this.location = location;
		this.ingredients = ingredients;
		this.garnish = garnish;
		this.glassType = glassType;
		this.preparation = preparation;
		this.notes = notes;
		this.drinkThumb = drinkThumb;
	}

	private void guardIsValidName(String name) {
		if (Objects.isNull( name ) || name.trim().isEmpty()) {
			throw new IllegalArgumentException( "name cannot be null or empty!" );
		}
	}

	private void guardIsValidAlternateName(String alternateName) {
		if (Objects.isNull( alternateName ) || alternateName.trim().isEmpty()) {
			throw new IllegalArgumentException( "alternateName cannot be null or empty!" );
		}
	}

	private void guardIsValidCategory(String category) {
		if (Objects.isNull( category ) || category.trim().isEmpty()) {
			throw new IllegalArgumentException( "category cannot be null or empty!" );
		}
	}

	private void guardIsValidIngredient(String ingredients) {
		if (Objects.isNull( ingredients ) || ingredients.trim().isEmpty()) {
			throw new IllegalArgumentException( "ingredient cannot be null or empty!" );
		}
	}

	private void guardIsValidGlassType(String glassType) {
		if (Objects.isNull( glassType ) || glassType.trim().isEmpty()) {
			throw new IllegalArgumentException( "glassType cannot be null or empty!" );
		}
	}

	private void guardIsValidInstruction(String instruction) {
		if (Objects.isNull( instruction ) || instruction.trim().isEmpty()) {
			throw new IllegalArgumentException( "instruction cannot be null or empty!" );
		}
	}

	private void guardIsValidDrinkThumb(String drinkThumb) {
		if (Objects.isNull( drinkThumb ) || drinkThumb.trim().isEmpty()) {
			throw new IllegalArgumentException( "drinkThumb cannot be null or empty!" );
		}
	}
}
