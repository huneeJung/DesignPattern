package Factory.factory;

import Factory.animal.Animal;
import Factory.animal.Cat;
import Factory.animal.Dog;

public class AnimalFactory {
    private String type;
    public AnimalFactory(String type) {
        this.type = type;
    }
    public Animal procreateAnimal(){
        switch (this.type){
            case "Cat" : return new Cat();
            case "Dog" : return new Dog();
        }
        throw new RuntimeException("동물이 아닙니다");
    }
}
