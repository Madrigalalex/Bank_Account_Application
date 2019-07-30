public class Checking extends Account {

    //List properties specific to a checking account
   private int debitCardNum;
   private int debitCardPin;


    //Constructor to initialize checking account
    public Checking(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }


    @Override
    public void setRate() {
       rate = getBaseRate() * .15;



    }

    public void setDebitCard(){
        debitCardNum = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));





    }





    //List methods specific to checking account
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features" +
                "\n Debit Card Number: " + debitCardNum +
                "\n Debit Card Pin: " + debitCardPin);

    }
}
