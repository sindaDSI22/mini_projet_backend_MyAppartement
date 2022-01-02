package com.sinda.appartements.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class appartement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idApp;
	private String nomApp;
	private String niveau ;
	
	@ManyToOne
	private immeuble immeuble;
	
		/*
	@Override
	public String toString() {
		return "appartement [idApp=" + idApp + ", nomApp=" + nomApp + ", niveau=" + niveau + "]";
	}*/
	

}
