package behavioral_patterns.chain_of_responsability.expense_approval_system;

public class Main {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        // Configurando a ordem da cadeia de responsabilidades
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        manager.approve(500);
        manager.approve(2000);
        director.approve(5000);
        ceo.approve(10000);
    }
}
