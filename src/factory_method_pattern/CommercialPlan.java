package factory_method_pattern;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 7/12/2022
 * Time: 2:00 PM
 */
public class CommercialPlan extends Plan {
    @Override
    void getRate() {
        rate = 7.50;
    }
}
