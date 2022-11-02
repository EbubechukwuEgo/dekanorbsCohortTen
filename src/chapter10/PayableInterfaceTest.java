package chapter10;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[] {
                new Invoice("01234", "seat", 2, 375.00),
                new Invoice("56789", "tire", 4, 79.99),
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
                new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00),
        };

        System.out.println(
                "Invoices and employees processed polymorphically:");

        for (Payable currentPayable:
             payableObjects) {
            System.out.printf("%n%s %npayment due: $%,.2f",
                    currentPayable.toString(),
                    currentPayable.getPaymentAmount());
        }
    }
}
