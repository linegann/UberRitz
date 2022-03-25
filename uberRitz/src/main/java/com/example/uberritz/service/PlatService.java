package com.example.uberritz.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.uberritz.model.Plat;
import com.example.uberritz.repository.PlatRepository;

import lombok.Data;

@Data
@Service
public class PlatService {

    @Autowired
    private PlatRepository platRepository;

    public Optional<Plat> getPlat(final Long id) {
        return platRepository.findById(id);
    }

    public Iterable<Plat> getPlats() {
        return platRepository.findAll();
    }

    public void deletePlat(final Long id) {
        platRepository.deleteById(id);
    }

    public Plat savePlat(Plat plat) {
        Plat savedPlat = platRepository.save(plat);
        return savedPlat;
    }

}