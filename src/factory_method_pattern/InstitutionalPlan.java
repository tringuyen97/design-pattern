package factory_method_pattern;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 7/12/2022
 * Time: 2:01 PM
 */
public class InstitutionalPlan extends Plan {
    @Override
    void getRate() {
        rate = 5.50;
    }
}
