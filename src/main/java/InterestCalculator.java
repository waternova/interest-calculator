public class InterestCalculator {

    private static final String INPUT_NOT_PRESENT_ERROR = "One of the inputs is null - principal: %d, percent interest: %d, time: %d";

    public Integer calculate(Integer principal, Integer percentageInterest, Integer timeInYears) throws RequiredInputNotPresentException {
        if (requiredInputsPresent(principal, percentageInterest, timeInYears)) {
            return interestFor(principal, percentageInterest, timeInYears);
        }
        throw new RequiredInputNotPresentException(String.format(INPUT_NOT_PRESENT_ERROR, principal, percentageInterest, timeInYears));
    }

    private Integer interestFor(Integer principal, Integer percentageInterest, Integer timeInYears) {
        return (principal * percentageInterest * timeInYears) / 100;
    }

    private boolean requiredInputsPresent(Integer principal, Integer percentageInterest, Integer timeInYears) {
        return principal != null && percentageInterest != null && timeInYears != null;
    }
}
