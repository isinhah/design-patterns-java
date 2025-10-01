package structural_patterns.bridge.exporting_documents;

// 2 - Abstração: Relatório
abstract class Report {
    protected ExportFormat format;

    public Report(ExportFormat format) {
        this.format = format;
    }

    public abstract void generateReport();
}
