package structural_patterns.bridge.exporting_documents;

public class App {
    public static void main(String[] args) {
        Report financesReportPDF = new FinancesReport(new PdfExport());
        financesReportPDF.generateReport();

        Report financesReportExcel = new FinancesReport(new ExcelExport());
        financesReportExcel.generateReport();
    }
}
