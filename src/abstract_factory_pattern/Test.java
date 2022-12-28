package abstract_factory_pattern;

import abstract_factory_pattern.factory.GUIFactory;
import abstract_factory_pattern.factory.MacOSFactory;
import abstract_factory_pattern.factory.WindowsFactory;
import abstract_factory_pattern.object.Button;
import abstract_factory_pattern.object.CheckBox;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 12/28/2022
 * Time: 5:49 PM
 */
public class Test {

    public static void main(String[] args) {

        int i = ThreadLocalRandom.current().nextInt(0, 2);

        GUIFactory factory;

        switch (i) {
            case 0:
                factory = new WindowsFactory();
                break;
            case 1:
                factory = new MacOSFactory();
                break;
            default:
                throw new RuntimeException("Error: Unknown");
        }

        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();

        button.paint();
        checkBox.paint();

    }
}
