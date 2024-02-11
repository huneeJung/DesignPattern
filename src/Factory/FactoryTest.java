package Factory;

import Factory.animal.Animal;
import Factory.factory.AnimalFactory;

public class FactoryTest {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory("Dog");
        Animal dog = animalFactory.procreateAnimal();
        dog.setName("Happy");
        dog.speak();
        animalFactory = new AnimalFactory("Cat");
        Animal cat = animalFactory.procreateAnimal();
        cat.setName("Happy");
        cat.speak();
    }
}
