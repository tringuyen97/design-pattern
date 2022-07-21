package abstract_factory_pattern;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 7/21/2022
 * Time: 5:40 PM
 */
public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
