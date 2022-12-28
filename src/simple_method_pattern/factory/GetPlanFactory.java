package simple_method_pattern.factory;

import simple_method_pattern.object.CommercialPlan;
import simple_method_pattern.object.DomesticPlan;
import simple_method_pattern.object.InstitutionalPlan;
import simple_method_pattern.object.Plan;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 7/12/2022
 * Time: 2:02 PM
 */
public class GetPlanFactory {

    public Plan getPlan(String planType) {
        switch (planType) {
            case "DOMESTICPLAN":
                return new DomesticPlan();
            case "COMMERCIALPLAN":
                return new CommercialPlan();
            case "INSTITUTIONALPLAN":
                return new InstitutionalPlan();
            default:
                return null;
        }
    }
}
