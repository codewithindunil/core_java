package abccompany;

public class Cashier {

    double moneyReceived;
    double duePayment;
    double balance;

    Cashier() {

    }

    Cashier(double moneyReceived, double duePayment) {
        this.moneyReceived = moneyReceived;
        this.duePayment = duePayment;

    }

    void setBalance() {
        balance = moneyReceived - duePayment;

    }

    void printReceipt() {
        System.out.println("money received : "+moneyReceived);
        System.out.println("due pay        : "+duePayment);
        System.out.println("balance        : "+balance);
    }

}
