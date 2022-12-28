package abstract_factory_pattern.factory;

import abstract_factory_pattern.object.Button;
import abstract_factory_pattern.object.CheckBox;
import abstract_factory_pattern.object.WindowsButton;
import abstract_factory_pattern.object.WindowsCheckBox;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 12/28/2022
 * Time: 5:47 PM
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
