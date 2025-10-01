package prototype.cloned_documents;

public class App {
    public static void main(String[] args) {
        Document originalDoc = new Document("Relatório - Jan/2025", "Conteúdo");

        Document clone1 = originalDoc.clone();
        clone1.setTitle("Relatório de Vendas - Jan/2025 - Cópia 1");
        clone1.setContent("Conteúdo 2");

        Document clone2 = originalDoc.clone();
        clone1.setTitle("Relatório de Vendas - Jan/2025 - Cópia 2");
        clone1.setContent("Conteúdo 3");

        System.out.println("Original: " + originalDoc);
        System.out.println("Clone 1: " + clone1);
        System.out.println("Clone 2: " + clone2);
    }
}
