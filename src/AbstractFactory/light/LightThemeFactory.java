package AbstractFactory.light;

import AbstractFactory.element.Button;
import AbstractFactory.factory.UIThemeFactory;
import AbstractFactory.element.TextField;

public class LightThemeFactory implements UIThemeFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}
