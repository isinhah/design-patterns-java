package structural_patterns.bridge.exporting_documents;

public class ExcelExport implements ExportFormat {

    @Override
    public void export(String title, String content) {
        System.out.println("Exporting to EXCEL:\n" + "Title: " + title + "\nContent: " + content);
    }
}
