package model;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String city;
    private String country;
    private double area; // tamaño en m²
    private double annualBudget;
    private List<Animal> animals;

    public Zoo(String name, String city, String country, double area, double annualBudget) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.area = area;
        this.annualBudget = annualBudget;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Getters
    public String getName() { return name; }
    public String getCity() { return city; }
    public String getCountry() { return country; }
    public double getArea() { return area; }
    public double getAnnualBudget() { return annualBudget; }
    public List<Animal> getAnimals() { return animals; }
}
