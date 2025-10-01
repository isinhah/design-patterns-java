package structural_patterns.bridge.exporting_documents;

// 1 - Implementação: Formato de exportação
public interface ExportFormat {
    void export(String title, String content);
}
