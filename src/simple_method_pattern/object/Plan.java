package simple_method_pattern.object;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 7/12/2022
 * Time: 1:54 PM
 */
public abstract class Plan {

    protected double rate;

    public abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
