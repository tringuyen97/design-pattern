package factory_method_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 7/12/2022
 * Time: 2:05 PM
 */
public class GenerateBill {

    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planType = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.valueOf(br.readLine());

        Plan plan = planFactory.getPlan(planType);

        System.out.print("Bill amount for " + planType + " of " + units + "units is: ");
        plan.getRate();
        plan.calculateBill(units);
    }
}
