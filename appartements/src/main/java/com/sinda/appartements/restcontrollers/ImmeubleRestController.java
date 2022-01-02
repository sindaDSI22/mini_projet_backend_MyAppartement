package com.sinda.appartements.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sinda.appartements.entities.appartement;
import com.sinda.appartements.entities.immeuble;
import com.sinda.appartements.repos.ImmeubleRepository;
import com.sinda.appartements.service.AppartementService;

@RestController
@RequestMapping("/api/immeubles")
@CrossOrigin
public class ImmeubleRestController {
	@Autowired ImmeubleRepository immRep;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<immeuble> getAllImmeubles() {
		return immRep.findAll();
	}
	
	
	
	
}
