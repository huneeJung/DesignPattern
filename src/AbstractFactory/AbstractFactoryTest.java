package AbstractFactory;

import AbstractFactory.element.Button;
import AbstractFactory.dark.DarkThemeFactory;
import AbstractFactory.light.LightThemeFactory;
import AbstractFactory.factory.UIThemeFactory;
import AbstractFactory.element.TextField;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        UIThemeFactory darkFactory = new DarkThemeFactory();
        UIThemeFactory lightFactory = new LightThemeFactory();

        Button darkButton = darkFactory.createButton();
        TextField darkTextField = darkFactory.createTextField();
        darkButton.render();
        darkTextField.render();

        Button lightButton = lightFactory.createButton();
        TextField lightTextField = lightFactory.createTextField();
        lightButton.render();
        lightTextField.render();
    }
}
