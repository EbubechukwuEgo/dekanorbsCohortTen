package chapter5;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy autoPolicy1 = new AutoPolicy(111111, "Mercedes R350", "NY");
        AutoPolicy autoPolicy2 = new AutoPolicy(121212, "Toyota Land Cruiser Prado TX.L", "NE");

        policyInNoFaultState(autoPolicy1);
        policyInNoFaultState(autoPolicy2);
    }

    private static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy: ");
        System.out.printf("Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(),
                policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is": "is not"));
    }
}
