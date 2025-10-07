package behavioral_patterns.chain_of_responsability.expense_approval_system;

// Gerente pode aprovar despesas de qualquer valor
public class CEO extends Approver {

    @Override
    public void approve(double amount) {
        System.out.println("CEO approved the expense of R$" + amount);
    }
}
