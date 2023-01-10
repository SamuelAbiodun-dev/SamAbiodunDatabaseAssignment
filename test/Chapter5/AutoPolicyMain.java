package Chapter5;

class AutoPolicyMain {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(380, "Pathfinder", "NJ");
        AutoPolicy policy2 = new AutoPolicy(1001, "Lexus", "ME");
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }
    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s:%nState %s %s a no-fault state%n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                (policy.isNoFaultState() ? "is": "is not"));

    }
}