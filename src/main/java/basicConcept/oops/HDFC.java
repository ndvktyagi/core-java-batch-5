package basicConcept.oops;

public class HDFC implements RBI{
    @Override
    public float savingRateOfInterest() {
        return 5.0f;
    }

    @Override
    public float homeLoanRateOfInterest() {
        return 6.50f;
    }

    @Override
    public float carLoanRateOfInterest() {
        return 10.25f;
    }
}
