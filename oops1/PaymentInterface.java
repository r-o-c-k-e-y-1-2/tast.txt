package oops1;

// Interface
interface Payment {
 void processPayment();
}


class CreditCardPayment implements Payment {
 public void processPayment() {
     System.out.println("Processing credit card payment...");
 }
}


class PaypalPayment implements Payment {
 public void processPayment() {
     System.out.println("Processing PayPal payment...");
 }
}


public class PaymentInterface{
 public static void main(String[] args) {
     Payment credit = new CreditCardPayment();
     Payment paypal = new PaypalPayment();

     credit.processPayment();
     paypal.processPayment();  
 }
}
