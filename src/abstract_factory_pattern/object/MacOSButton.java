package abstract_factory_pattern.object;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 12/28/2022
 * Time: 5:40 PM
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
