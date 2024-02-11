package AbstractFactory.dark;

import AbstractFactory.element.Button;
import AbstractFactory.factory.UIThemeFactory;
import AbstractFactory.element.TextField;

public class DarkThemeFactory implements UIThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
