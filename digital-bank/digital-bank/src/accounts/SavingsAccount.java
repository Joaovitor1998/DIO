package accounts;

import java.math.BigDecimal;

public class SavingsAccount extends Account {

    private static long NUMBER_GENERATOR = 1;

    public SavingsAccount(BigDecimal balance) {
        super(balance);
        super.number = NUMBER_GENERATOR++;
        super.accountType = "Savings Account";
    }

}
