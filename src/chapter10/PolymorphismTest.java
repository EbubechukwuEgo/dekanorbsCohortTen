package chapter10;

import oop.BasePlusCommissionEmployee;
import oop.CommissionEmployee;

public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones","222-22-222",10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "333-33-333",
                        5000, .04, 300);

        System.out.printf("%s %s:%n%n%s%n%n",
                "Call CommissionEmployee's toString with superclass reference ",
                "to superclass object", commissionEmployee.toString());

        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object", basePlusCommissionEmployee.toString());

        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee toString with superclass",
                "reference to subclass object", commissionEmployee2.toString());
    }
}
