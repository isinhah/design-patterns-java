package behavioral_patterns.chain_of_responsability.expense_approval_system;

// Gerente pode aprovar despesas de até R$1000
public class Manager extends Approver {
    @Override
    public void approve(double amount) {
        if (amount <= 1000) {
            System.out.println("Manager approved the expense of R$" + amount);
        } else {
            nextApprover.approve(amount);
        }
    }
}