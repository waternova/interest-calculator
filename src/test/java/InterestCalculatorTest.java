import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class InterestCalculatorTest {

    private InterestCalculator interestCalculator;

    @Before
    public void setUp() throws Exception {
        interestCalculator = new InterestCalculator();
    }

    @Test
    public void shouldReturnAValueForGivenInput() throws Exception {
        Double principal = 1.0;
        Double percentageInterest = 1.0;
        Double timeInYears = 1.0;

        assertThat(interestCalculator.calculate(principal, percentageInterest, timeInYears), not(nullValue()));
    }

    @Test
    public void shouldReturnInterestAccruedForRateOf10PercentFor5YearsOnAnAmountOf100000Dollars() throws Exception {
        Double principal = 100000.0;
        Double percentageInterest = 10.0;
        Double timeInYears = 5.0;

        assertThat(interestCalculator.calculate(principal, percentageInterest, timeInYears), is(50000.0));
    }


    @Test(expected = RequiredInputNotPresentException.class)
    public void shouldHandleNullInputs() throws Exception {
        interestCalculator.calculate(1.0, 1.0, null);
    }
}
