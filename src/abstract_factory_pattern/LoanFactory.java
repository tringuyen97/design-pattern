package abstract_factory_pattern;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 7/21/2022
 * Time: 5:42 PM
 */
public class LoanFactory extends AbstractFactory {

    public Bank getBank(String bank){
        return null;
    }

    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BussinessLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }
}
