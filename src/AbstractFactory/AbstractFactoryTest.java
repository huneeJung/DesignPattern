package AbstractFactory;

import AbstractFactory.button.Button;
import AbstractFactory.factory.DarkThemeFactory;
import AbstractFactory.factory.LightThemeFactory;
import AbstractFactory.factory.UIThemeFactory;
import AbstractFactory.textfield.TextField;

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
