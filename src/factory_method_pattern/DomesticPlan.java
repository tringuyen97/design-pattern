package factory_method_pattern;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 7/12/2022
 * Time: 1:56 PM
 */
public class DomesticPlan extends Plan {
    @Override
    void getRate() {
        rate = 3.50;
    }
}
