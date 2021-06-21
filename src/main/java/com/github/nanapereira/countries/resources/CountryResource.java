package com.github.nanapereira.countries.resources;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.nanapereira.countries.entities.Country;
import com.github.nanapereira.countries.repositories.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {

	private final CountryRepository repository;

	public CountryResource(final CountryRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public Page<Country> coutries(Pageable page) {
		return repository.findAll(page);
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/(id)")
	public ResponseEntity getOne(@PathVariable Long id) {
		Optional<Country> optional = repository.findById(id);
		if (optional.isPresent()) {
			return ResponseEntity.ok(optional.get());
		} else {
			return ResponseEntity.notFound().build();
		}

	}
}
