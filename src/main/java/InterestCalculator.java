/*
The simple interest formula allows us to calculate I, which is the interest earned or charged on a loan.
According to this formula, the amount of interest is given by I = Prt, where P is the principal,
r is the annual interest rate in decimal form, and t is the loan period expressed in years.
*/
public class InterestCalculator {

    public Integer calculate(Integer principal, Integer percentageInterest, Integer timeInYears) throws RequiredInputNotPresentException {
        if (requiredInputsPresent(principal, percentageInterest, timeInYears)) {
            return interestFor(principal, percentageInterest, timeInYears);
        }
        throw new RequiredInputNotPresentException("Required input parameters not present.");
    }

    private Integer interestFor(Integer principal, Integer percentageInterest, Integer timeInYears) {
        return (principal * percentageInterest * timeInYears) / 100;
    }

    private boolean requiredInputsPresent(Integer principal, Integer percentageInterest, Integer timeInYears) {
        return principal != null && percentageInterest != null && timeInYears != null;
    }
}
