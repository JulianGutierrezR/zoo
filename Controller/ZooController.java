package controller;

import model.Animal;
import model.Zoo;

import java.util.List;

public class ZooController {
    private Zoo zoo;

    public ZooController(Zoo zoo) {
        this.zoo = zoo;
    }

    public void addAnimal(Animal animal) {
        zoo.addAnimal(animal);
    }

    public List<Animal> getAnimals() {
        return zoo.getAnimals();
    }

    // Otros métodos para manejar la lógica
}
