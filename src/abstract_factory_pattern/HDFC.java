package abstract_factory_pattern;

/**
 * Creator: Nguyen Ngoc Tri
 * Date: 7/21/2022
 * Time: 5:24 PM
 */
public class HDFC implements Bank {

    private final String BNAME;

    public HDFC() {
        this.BNAME = "HDFC BANK";
    }

    @Override
    public String getBankName() {
        return null;
    }
}
