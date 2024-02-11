package AbstractFactory.dark;

import AbstractFactory.element.Button;

public class DarkButton implements Button {
    public void render(){
        System.out.println("I'm DarkButton!");
    }
}
