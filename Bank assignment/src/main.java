import java.util.Date;

public class main {
    public static void main(String args[]){
        customer I = new customer("Timothy", 500, 1500);
        System.out.println(I);

        I.deposit(100, new Date(), customer.SAVING);
        I.withdraw(500, new Date(), customer.SAVING);
        I.displayDeposits();
        I.displayWithdraws();
        System.out.println(I);
    }
}