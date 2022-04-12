package com.uhi.hsp.repository;

import com.uhi.hsp.model.Fulfillments;
import com.uhi.hsp.model.Practitioner;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
@Transactional
public interface FulfillmentsRepository extends JpaRepository<Fulfillments, Integer> {
	Fulfillments findByFulfillmentIdAndProviderProviderId(Integer id,Integer provide);
	@Modifying
	@Query("update Fulfillments f set f.status = :status where f.fulfillmentId = :id")
	int updateStatus(@Param("status") String status, @Param("id") Integer id);
	// @Query(value = "SELECT id FROM Fulfillments WHERE name = ?1", nativeQuery = true)
	public List<Fulfillments> findByPractitionerId(Practitioner person);
	
	
}


	