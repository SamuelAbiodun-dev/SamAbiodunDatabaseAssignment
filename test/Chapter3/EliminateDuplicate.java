package Chapter3;

public class EliminateDuplicate {
        //display of the variables needed for the accounts
        String name;
        double balance;

        //Constructor needed because the instances created are needed to be initialized
        //The condition is needed to be set alongside
        public EliminateDuplicate(String name, double balance) {
            this.name = name;

            if (balance > 0) {
                this.balance = balance;
            }
        }


    //Set the name and set the condition

        public void setName(String name) {
            this.name = name;
        }
        //Get the name that has been set already when needed
        public String getName() {
            return name;
        }
        //The new balance is meant to be gotten after an amount of money has been deposited
        public double getBalance() {
            return balance;
        }
        //The money to be set into the account balance is the amount of money deposited
        public void deposit(double depositAmt) {
            if(depositAmt > 0.0 ) {
                balance = balance + depositAmt;
            }
        }

    public void displayAccount(String name, double balance) {
this.name = name;
this.balance = balance;
    }
}


