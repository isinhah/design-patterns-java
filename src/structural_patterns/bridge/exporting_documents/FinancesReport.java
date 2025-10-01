package structural_patterns.bridge.exporting_documents;

public class FinancesReport extends Report {

    public FinancesReport(ExportFormat format) {
        super(format);
    }

    @Override
    public void generateReport() {
        format.export("Relatório financeiro", "Conteúdo");
    }
}