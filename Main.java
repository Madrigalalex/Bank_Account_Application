import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();


        String file = "/Users/alexmadrigal/Desktop/NewBankAccounts.csv";


        //Read a CSV File

        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder) {
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println("name: " + name +  "\nSSN: " + SSN + "\nAccount Type: " + accountType +
                    "Deposit: $" + initDeposit);

            if (accountType.equals("Savings")) {

                accounts.add(new Savings(name, SSN, initDeposit));
            }
            else if (accountType.equals("Checking")){

                accounts.add(new Checking(name, SSN, initDeposit));

            }
            else {
                System.out.println("Error Reading Account Type");
            }


        }


        for (Account acc: accounts) {
            System.out.println("\n***************");
            acc.showInfo();

        }


    }
}
