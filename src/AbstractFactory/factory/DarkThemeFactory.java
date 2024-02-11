package AbstractFactory.factory;

import AbstractFactory.button.Button;
import AbstractFactory.button.DarkButton;
import AbstractFactory.textfield.DarkTextField;
import AbstractFactory.textfield.TextField;

public class DarkThemeFactory implements UIThemeFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
