public abstract class Account implements IBaseRate {

    //List common properties for savings and checkings accounts
   private String name;
   private String SSN;
   private double balance;
   private static int index = 10000;

   protected String accountNumber;
   protected double rate;



    //Constructor to set base properties
    public Account(String name, String SSN, double initDeposit){
        this.name = name;
        this.SSN = SSN;
        balance = initDeposit;


        //set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();



    }


    public abstract void setRate();


    private String setAccountNumber(){
        String lastTwoSSN = SSN.substring(SSN.length() - 2, SSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return  lastTwoSSN + uniqueID + randomNumber;




    }

    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Acrrued Interest: $" + accruedInterest);
        printBalance();
    }

    //List common methods

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing Amount: " + amount);
        printBalance();

    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing amount:  " + amount);
        printBalance();

    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("To where do you want to depsoit to?: ");
        printBalance();


    }

    public void printBalance(){
        System.out.println("Your Balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println( "Name: " + name + "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance);

    }




}
