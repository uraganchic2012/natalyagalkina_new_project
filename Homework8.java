public class Homework8 {
    public static void main(String[] args){
        //        - Finish up the logic that calculates the balance
        //        - Create a method that withdraws from the balance
        //        - Check that if a bank customer deposits $500, $150 and $35 and then withdraws $40 and $120 the balance is correct
        //        - Print out a meaningful message if it is correct and if it is not

        BankingAccount myAccount = new BankingAccount();
        myAccount.deposit(500);
        myAccount.deposit(sum: 150);
        myAccount.deposit(sum: 35);
        

        // please finish the rest
    }
}

class BankingAccount {

    public int balance;

    public void deposit(int sum) {
        balance = balance + sum;
        System.out.println(balance);
        // do what?
    }
    public void withdrawal(int sum){
        balance = balance - sum;
        System.out.println(balance);
    }
    // what about withdrawal?
}



