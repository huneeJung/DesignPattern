package AbstractFactory.factory;

import AbstractFactory.element.Button;
import AbstractFactory.element.TextField;

public interface UIThemeFactory {

    Button createButton();
    TextField createTextField();

}
