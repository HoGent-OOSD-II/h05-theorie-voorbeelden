package domein;

import java.math.BigDecimal;

public class TipCalculator {
    private BigDecimal amount;
    private BigDecimal tipPercentage;

    public TipCalculator() {
        this(new BigDecimal(0));
    }

    public TipCalculator(BigDecimal amount) {
        setAmount(amount);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public final void setAmount(BigDecimal amount) {
        if (amount.signum() == -1)
            throw new IllegalArgumentException("Geen negatief bedrag toegelaten!");
        this.amount = amount;
    }

    public BigDecimal calculateTip() {
        return amount.multiply(tipPercentage);
    }

    public BigDecimal calculateTotal() {
        return amount.add(calculateTip());
    }

    public void setTipPercentage(BigDecimal tipPercentage) {
        if (tipPercentage.signum() == -1 || tipPercentage.compareTo(BigDecimal.valueOf(30)) > 1)
            throw new IllegalArgumentException("Geen negatief percentage of percentage boven de 30% toegelaten!");
        this.tipPercentage = tipPercentage;
    }
}