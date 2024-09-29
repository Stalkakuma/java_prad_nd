import ibank.Bank;
import ibank.BaseBankTest;

import java.math.BigDecimal;

public class BankTest extends BaseBankTest {

    @Override
    protected Bank createBank() {
        return new MyBank();
    }
}
