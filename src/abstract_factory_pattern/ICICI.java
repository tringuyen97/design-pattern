package abstract_factory_pattern;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 7/21/2022
 * Time: 5:27 PM
 */
public class ICICI implements Bank {

    private final String BNAME;

    public ICICI() {
        this.BNAME = "ICICI BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
