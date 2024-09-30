package model;

public class Animal {
    private String commonName;
    private String scientificName;
    private String family;
    private String id; // número de identificación
    private String species;
    private String gender;
    private int birthYear;
    private String countryOfOrigin;
    private String continent;

    public Animal(String commonName, String scientificName, String family, String id, 
                  String species, String gender, int birthYear, 
                  String countryOfOrigin, String continent) {
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.family = family;
        this.id = id;
        this.species = species;
        this.gender = gender;
        this.birthYear = birthYear;
        this.countryOfOrigin = countryOfOrigin;
        this.continent = continent;
    }

    // Getters
    public String getCommonName() { return commonName; }
    public String getScientificName() { return scientificName; }
    public String getFamily() { return family; }
    public String getId() { return id; }
    public String getSpecies() { return species; }
    public String getGender() { return gender; }
    public int getBirthYear() { return birthYear; }
    public String getCountryOfOrigin() { return countryOfOrigin; }
    public String getContinent() { return continent; }
}
