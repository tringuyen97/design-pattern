package abstract_factory_pattern.factory;

import abstract_factory_pattern.object.Button;
import abstract_factory_pattern.object.CheckBox;
import abstract_factory_pattern.object.MacOSButton;
import abstract_factory_pattern.object.MacOSCheckBox;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 12/28/2022
 * Time: 5:46 PM
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
