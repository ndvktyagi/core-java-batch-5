package basicConcept.oops;

public class BankInterfaceTest {
    public static void main(String args[]){
        RBI rbiPnb = new PNB();
        RBI rbiHdfc = new HDFC();
        System.out.println("PNB Rate of Interest");
        System.out.println(rbiPnb.savingRateOfInterest());
        System.out.println(rbiPnb.homeLoanRateOfInterest());
        System.out.println(rbiPnb.carLoanRateOfInterest());

        System.out.println("HDFC Rate of Interest");
        System.out.println(rbiHdfc.savingRateOfInterest());
        System.out.println(rbiHdfc.homeLoanRateOfInterest());
        System.out.println(rbiHdfc.carLoanRateOfInterest());
    }
}
