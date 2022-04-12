package com.uhi.hsp.repository;

import com.uhi.hsp.model.Practitioner;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PractitionerRepository extends JpaRepository<Practitioner, Integer> {
	public List<Practitioner> findByName(String name);
}
