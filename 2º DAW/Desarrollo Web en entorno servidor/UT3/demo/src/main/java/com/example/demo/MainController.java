package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
    public class MainController {
        @GetMapping("/")
        public String saludo(Model model){ //el Model debe ser el de org.springframework.ui, si no peta
            model.addAttribute("saludo", "Hello my people!");
            return "index";
        }
        @GetMapping("/despedida")
        public String despedida(Model model){
            model.addAttribute("despedida", "Bye my people!");
            return "despedida";
        }
        @GetMapping("/felicita/{id}")
        public String felicitar(@PathVariable int id,
                                @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "edad", required = false, defaultValue="20 ") String edad,
                                Model model){
            model.addAttribute("id", id);
            model.addAttribute("name", name);
            model.addAttribute("edad", edad);
            return "felicita";
        }
    }


