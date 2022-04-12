package com.uhi.hsp.repository;

import com.uhi.hsp.model.Practitioner;
import com.uhi.hsp.model.Provider;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProviderRepository extends JpaRepository<Provider, Integer> {
	public Provider findByProviderIdAndFulfillmentsFulfillmentId(Integer id,Integer fulfillment); 
	
}
