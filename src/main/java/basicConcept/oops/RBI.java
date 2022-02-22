package basicConcept.oops;

public interface RBI {
    default float  savingRateOfInterest(){
        return 4.0f;
    }
    default float  homeLoanRateOfInterest(){
        return 6.85f;
    }
    float carLoanRateOfInterest();
}
