1. Clase Animal
La clase Animal representa un animal específico en el zoológico y contiene información sobre sus características. Aquí están los detalles:

Atributos
commonName: El nombre común del animal (ej. "León").
scientificName: El nombre científico del animal (ej. "Panthera leo").
family: La familia taxonómica a la que pertenece el animal (ej. "Felidae").
id: Un número de identificación único para el animal (ej. "001").
species: La especie a la que pertenece el animal (ej. "Mamífero").
gender: El género del animal (ej. "Masculino" o "Femenino").
birthYear: El año de nacimiento del animal (ej. 2015).
countryOfOrigin: El país de origen del animal (ej. "Sudáfrica").
continent: El continente de origen del animal (ej. "África").
Métodos
Constructor: Permite crear una instancia de Animal con todos sus atributos.
Getters: Métodos que permiten acceder a los atributos de la clase. Por ejemplo, getCommonName() devuelve el nombre común del animal.



2. Clase Zoo
La clase Zoo representa un zoológico en sí mismo y gestiona una colección de animales. Aquí están los detalles:

Atributos
name: El nombre del zoológico (ej. "Zoológico de Cali").
city: La ciudad donde se encuentra el zoológico (ej. "Cali").
country: El país donde se encuentra el zoológico (ej. "Colombia").
area: El tamaño del zoológico en metros cuadrados (ej. 15000 m²).
annualBudget: El presupuesto anual del zoológico (ej. 2000000).
animals: Una lista que almacena los animales que están en el zoológico.
Métodos
Constructor: Permite crear una instancia de Zoo con todos sus atributos y inicializa la lista de animales.
addAnimal(Animal animal): Método que permite agregar un nuevo animal a la lista de animales del zoológico.
Getters: Métodos que permiten acceder a los atributos de la clase, como el nombre del zoológico y la lista de animales.
