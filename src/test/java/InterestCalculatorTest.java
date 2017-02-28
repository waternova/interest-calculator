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
        Integer principal = 1;
        Integer percentageInterest = 1;
        Integer timeInYears = 1;

        assertThat(interestCalculator.calculate(principal, percentageInterest, timeInYears), not(nullValue()));
    }

    @Test
    public void shouldReturnInterestAccruedForRateOf10PercentFor5YearsOnAnAmountOf100000Dollars() throws Exception {
        Integer principal = 100000;
        Integer percentageInterest = 10;
        Integer timeInYears = 5;

        assertThat(interestCalculator.calculate(principal, percentageInterest, timeInYears), is(50000));
    }


    @Test(expected = RequiredInputNotPresentException.class)
    public void shouldHandleNullInputs() throws Exception {
        interestCalculator.calculate(1, 1, null);
    }
}