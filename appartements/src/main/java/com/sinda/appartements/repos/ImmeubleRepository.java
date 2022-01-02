package com.sinda.appartements.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinda.appartements.entities.immeuble;

public interface ImmeubleRepository extends JpaRepository<immeuble, Long>{

}
