package com.example.uberritz.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.uberritz.model.Plat;
import com.example.uberritz.service.PlatService;

@RestController
public class PlatController {

    @Autowired
    private PlatService platService;

    /**
     * Create - Add a new employee
     * @param plat An object employee
     * @return The employee object saved
     */
    @PostMapping("/plat")
    public Plat createPlat(@RequestBody Plat plat) {
        return platService.savePlat(plat);
    }


    /**
     * Read - Get one employee
     * @param id The id of the employee
     * @return An Employee object full filled
     */
    @GetMapping("/plat/{id}")
    public Plat getEmployee(@PathVariable("id") final Long id) {
        Optional<Plat> plat = platService.getPlat(id);
        if(plat.isPresent()) {
            return plat.get();
        } else {
            return null;
        }
    }

    /**
     * Read - Get all plats
     * @return - An Iterable object of Plat full filled
     */
    @GetMapping("/plats")
    public Iterable<Plat> getEmployees() {
        return platService.getPlats();
    }

    /**
     * Update - Update an existing employee
     * @param id - The id of the plat to update
     * @param plat - The plat object updated
     * @return
     */
    
    @PutMapping("/plat/{id}")
    public Plat updatePlat(@PathVariable("id") final Long id, @RequestBody Plat plat) {
        Optional<Plat> p = platService.getPlat(id);
        if(p.isPresent()) {
            Plat currentPlat = p.get();

            String nom = plat.getNom();
            if(nom != null) {
                currentPlat.setNom(nom);
            }

            int prix = plat.getPrix();
            currentPlat.setPrix(prix);

            platService.savePlat(currentPlat);
            return currentPlat;
        } else {
            return null;
        }
    }
    

    /**
     * Delete - Delete a plat
     * @param id - The id of the plat to delete
     */
    @DeleteMapping("/plat/{id}")
    public void deletePlat(@PathVariable("id") final Long id) {
        platService.deletePlat(id);
    }


}