package factory_method_pattern;

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
