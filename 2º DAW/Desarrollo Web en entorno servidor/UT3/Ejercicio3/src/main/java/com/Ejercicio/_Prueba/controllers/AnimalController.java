package com.Ejercicio._Prueba.controllers;

import com.Ejercicio._Prueba.models.Animal;
import com.Ejercicio._Prueba.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AnimalController{

    @Autowired
    private AnimalService as;

    @GetMapping("/animals")
    public String animales(Model model) {
        model.addAttribute("animales", as.getAnimals());
        return "animals";
    }

    @GetMapping("animals/details/{id}")
    public String DetallesAnimal(@PathVariable int id, Model model) {
        Animal animal = as.getAnimal(id);
        String response = "redirect:/animals";
        if(animal != null){
            model.addAttribute("animal", animal);
            response = "details";
        }
        return response;
    }

    @GetMapping("/animals/create")
    public String crearPersona(Model model){
        model.addAttribute("animal", new Animal())
        return "animal/create";
    }
}

/*
Clase	            Responsabilidad
-------------------------------------------------------------------------------------
Animal	            Representa un animal, con sus atributos: nombre, especie, edad…
AnimalService	    Gestiona las operaciones de los animales.
AnimalController	Gestiona las peticiones web relacionadas con animales.
MainController	    Normalmente gestiona páginas generales, como la página de inicio.
*/