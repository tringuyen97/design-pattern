package abstract_factory_pattern.object;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 12/28/2022
 * Time: 5:43 PM
 */
public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created a Windows check box.");
    }
}
