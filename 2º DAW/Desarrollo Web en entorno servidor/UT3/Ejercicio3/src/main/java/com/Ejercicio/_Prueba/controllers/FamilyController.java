package com.Ejercicio._Prueba.controllers;

import com.Ejercicio._Prueba.interfaces.FamilyService;
import com.Ejercicio._Prueba.models.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FamilyController {

    @Autowired
    private FamilyService fs;

    @GetMapping("/families")
    public String animales(Model model){
        model.addAttribute("families", fs.getFamilies());
        return "families";
    }

}
