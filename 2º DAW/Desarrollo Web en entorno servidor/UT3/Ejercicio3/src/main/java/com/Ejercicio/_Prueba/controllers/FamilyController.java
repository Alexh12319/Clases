package com.Ejercicio._Prueba.controllers;

import com.Ejercicio._Prueba.interfaces.FamilyService;
import com.Ejercicio._Prueba.models.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FamilyController {

    @Autowired
    private FamilyService fs;

    @GetMapping("/families")
    public String animales(Model model){
        model.addAttribute("families", fs.getFamilies());
        return "families";
    }


    @GetMapping("/families/familyDetails/{id}")
    public String DetallesAnimal(@PathVariable int id, Model model) {
        Family littleFamily = fs.getFamily(id);
        String response = "redirect:/families";
        if(littleFamily != null){
            model.addAttribute("animal", littleFamily);
            response = "familyDetails";
        }
        return response;
    }






}
