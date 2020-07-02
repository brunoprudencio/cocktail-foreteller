package com.cocktailforeteller.application.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Getter
@Entity
@Table(name = "drink")
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Drink {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String alternateName;
	private String category;
	private String alcoholic;
	private String glassType;
	private String instruction;
	private String drinkThumb;

	@OneToMany(mappedBy = "drink")
	private final List<Ingredient> ingredient = new ArrayList<>();

	@OneToMany(mappedBy = "drink")
	private final List<Measure> measure = new ArrayList<>();

	public Drink(
			Long id,
			String idDrink,
			String name,
			String alternateName,
			String category,
			String alcoholic,
			String glassType,
			String instruction,
			String drinkThumb
	) {

		guardIsValidName( name );
		guardIsValidAlternateName( alternateName );
		guardIsValidCategory( category );
		guardIsValidAlcoholic( alcoholic );
		guardIsValidGlassType( glassType );
		guardIsValidInstruction( instruction );
		guardIsValidDrinkThumb( drinkThumb );

		this.id = id;
		this.name = name;
		this.alternateName = alternateName;
		this.category = category;
		this.alcoholic = alcoholic;
		this.glassType = glassType;
		this.instruction = instruction;
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

	private void guardIsValidAlcoholic(String alcoholic) {
		if (Objects.isNull( alcoholic ) || alcoholic.trim().isEmpty()) {
			throw new IllegalArgumentException( "alcoholic cannot be null or empty!" );
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
