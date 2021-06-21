package com.github.nanapereira.states.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.nanapereira.states.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
