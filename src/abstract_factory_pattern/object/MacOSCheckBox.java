package abstract_factory_pattern.object;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 12/28/2022
 * Time: 5:42 PM
 */
public class MacOSCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created a MacOSCheckBox.");
    }
}
