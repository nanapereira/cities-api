package com.github.nanapereira.countries.repositories;

import com.github.nanapereira.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country, Long> {

}
