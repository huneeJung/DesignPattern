package AbstractFactory.factory;

import AbstractFactory.button.Button;
import AbstractFactory.button.LightButton;
import AbstractFactory.textfield.LightTextField;
import AbstractFactory.textfield.TextField;

public class LightThemeFactory implements UIThemeFactory{

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}
