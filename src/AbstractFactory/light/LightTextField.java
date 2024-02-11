package AbstractFactory.light;

import AbstractFactory.element.TextField;

public class LightTextField implements TextField {
    public void render(){
        System.out.println("I'm LightTextField!");
    }
}
