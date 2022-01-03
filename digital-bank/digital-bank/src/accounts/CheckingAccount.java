package accounts;

import java.math.BigDecimal;

public class CheckingAccount extends Account {

    private static long NUMBER_GENERATOR = 1;

    public CheckingAccount(BigDecimal balance) {
        super(balance);
        super.number = NUMBER_GENERATOR++;
        super.accountType = "Checking Account";
    }

}