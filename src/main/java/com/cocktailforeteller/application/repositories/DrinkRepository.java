package com.cocktailforeteller.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cocktailforeteller.application.domain.Drink;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
}
