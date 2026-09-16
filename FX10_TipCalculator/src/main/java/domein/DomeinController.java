package domein;

import java.math.BigDecimal;

public class DomeinController {
	private TipCalculator tc;

	public DomeinController() {
		tc = new TipCalculator();
	}

	public void defineAmount(BigDecimal amount) {
		tc.setAmount(amount);
	}

	public void defineTipPercentage(BigDecimal tipPercentage) {
		tc.setTipPercentage(tipPercentage);
	}

	public BigDecimal giveTipAmount() {
		return tc.calculateTip();
	}
}
