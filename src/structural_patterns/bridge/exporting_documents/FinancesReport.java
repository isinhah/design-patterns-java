package structural_patterns.bridge.exporting_documents;

// Abstração refinada da ponte
public class FinancesReport extends Report {

    public FinancesReport(ExportFormat format) {
        super(format);
    }

    @Override
    public void generateReport() {
        format.export("Relatório financeiro", "Conteúdo");
    }
}