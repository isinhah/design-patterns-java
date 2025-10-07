package behavioral_patterns.chain_of_responsability.expense_approval_system;

// Gerente pode aprovar despesas de até R$5000
public class Director extends Approver {

    @Override
    public void approve(double amount) {
        if (amount <= 5000) {
            System.out.println("Director approved the expense of R$" + amount);
        } else {
            nextApprover.approve(amount);
        }
    }
}
