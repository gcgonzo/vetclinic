package com.gonzo.vetclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gonzo.vetclinic.entities.Vaccine;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine, Long> {

}
