package com.uhi.hsp.model;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.ToString;

@Data
@Table(schema = "hsp")
@Entity
@JsonIgnoreProperties
@ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class Fulfillments implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fulfillment_id")
	private Integer fulfillmentId;
	@ManyToOne
	@JoinColumn(name = "provider_id", nullable = false)
	// @ToString.Exclude
	private Provider provider;
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	@ToString.Exclude
	private Categories categories;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "practitioner_id")
	 @ToString.Exclude//new change
	private Practitioner practitionerId;
	@Column(name = "start_time")
	private String startTime;
	@Column(name = "end_time")
	private String endTime;
	private String type;
	private String status;

}
