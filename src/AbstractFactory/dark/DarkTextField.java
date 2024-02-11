package AbstractFactory.dark;

import AbstractFactory.element.TextField;

public class DarkTextField implements TextField {
    public void render(){
        System.out.println("I'm DarkTextField!");
    }
}
