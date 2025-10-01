package structural_patterns.bridge.exporting_documents;

public class PdfExport implements ExportFormat{

    @Override
    public void export(String title, String content) {
        System.out.println("Exporting to PDF:\n" + "Title: " + title + "\nContent: " + content);
    }
}
