package com.example.uberritz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.uberritz.model.Plat;

@Repository
public interface PlatRepository extends CrudRepository<Plat, Long> {

}