package AbstractFactory.light;

import AbstractFactory.element.Button;

public class LightButton implements Button {
    public void render(){
        System.out.println("I'm LightButton!");
    }
}
