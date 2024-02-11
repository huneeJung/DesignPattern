package AbstractFactory.factory;

import AbstractFactory.button.Button;
import AbstractFactory.textfield.TextField;

public interface UIThemeFactory {

    Button createButton();
    TextField createTextField();

}
