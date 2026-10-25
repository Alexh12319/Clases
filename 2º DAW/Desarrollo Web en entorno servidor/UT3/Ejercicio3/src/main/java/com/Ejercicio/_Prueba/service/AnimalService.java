package com.Ejercicio._Prueba.service;
import com.Ejercicio._Prueba.models.Animal;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;

@Service
public class AnimalService {
    ArrayList<Animal> animales = new ArrayList<>(
            Arrays.asList(new Animal(1, "Dodo", 50, true), new Animal(2, "Perro", 10, false)));
    int animalsCount = 0;

    public ArrayList<Animal> getAnimals(){
        animalsCount = 0;
        return animales;
    }

    public Animal getAnimal(int id){
        Animal animalin = new Animal();
        for(int i = 0; i < animales.size(); i++){
            if(animales.get(i).getId() == id) {
                animalin = animales.get(i);
            }
        }
        return animalin;
    }

    public Animal addAnimal(Animal a){
        animales.add(a);
        animalsCount ++;
        return a;
    }

    public Animal editAnimal(Animal a){
        a.setName(a.getName());
        a.setExtinct(a.getExtinct());
        a.setId(a.getId());
        a.setAverageLifeSpan(a.getAverageLifeSpan());
        return a;
    }

    public boolean deleteAnimal(int id){
        boolean eliminado = false;
        Animal animalin = new Animal();
        for(int i = 0; i < animales.size(); i++){
            if(animales.get(i).getId() == id) {
                animalin = animales.remove(i);
                eliminado = true;
            }
        }
        return eliminado;
    }
}
