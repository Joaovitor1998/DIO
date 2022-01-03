package accounts;

import java.math.BigDecimal;

public interface IAccount {

    void withdraw(BigDecimal value);

    void transferTo(BigDecimal value, Account account);

    void depositValue(BigDecimal value);

}
