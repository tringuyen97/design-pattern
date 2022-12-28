package abstract_factory_pattern.factory;

import abstract_factory_pattern.object.Button;
import abstract_factory_pattern.object.CheckBox;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 12/28/2022
 * Time: 5:45 PM
 */
public interface GUIFactory {

    Button createButton();

    CheckBox createCheckBox();
}
