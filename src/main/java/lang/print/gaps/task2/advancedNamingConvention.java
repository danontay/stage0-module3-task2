package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    private static final int ADULT_AGE = 18;

    private int age;
    private int phoneNumber;

    public void callToFriend() {
        System.out.println("Calling...");
    }

    public void callByNumber(int Number) {
        System.out.println("Call to " + getPhoneNumber());
    }

    public int getPhoneNumber(){
     return this.phoneNumber;
    }
}
