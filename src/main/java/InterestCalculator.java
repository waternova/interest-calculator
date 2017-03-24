public class InterestCalculator {

    private static final String INPUT_NOT_PRESENT_ERROR = "One of the inputs is null - principal: %f, percent interest: %f, time: %f";

    public double calculate(Double principal, Double percentageInterest, Double timeInYears) throws RequiredInputNotPresentException {
        if (requiredInputsPresent(principal, percentageInterest, timeInYears)) {
            return interestFor(principal, percentageInterest, timeInYears);
        }
        throw new RequiredInputNotPresentException(String.format(INPUT_NOT_PRESENT_ERROR, principal, percentageInterest, timeInYears));
    }

    private double interestFor(Double principal, Double percentageInterest, Double timeInYears) {
        return (principal * percentageInterest * timeInYears) / 100;
    }

    private boolean requiredInputsPresent(Double principal, Double percentageInterest, Double timeInYears) {
        return principal != null && percentageInterest != null && timeInYears != null;
    }
}
