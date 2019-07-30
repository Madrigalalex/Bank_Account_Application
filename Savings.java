public class Savings extends Account {
    //List properties specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxkey;


    //Constructor to initialize settings for the Savings Account
    public Savings(String name, String SSN, double initDesposit) {
        super(name, SSN, initDesposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositbox();


    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositbox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        System.out.println(safetyDepositBoxID);
        safetyDepositBoxkey = (int) (Math.random() * Math.pow(10, 4));

    }

    //List any methods specific to the savings account
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account Features" + "\nSafety Deposit Box ID: " +
                safetyDepositBoxID + "\nSafety Deposit Box Key: " + safetyDepositBoxkey);

    }

}
