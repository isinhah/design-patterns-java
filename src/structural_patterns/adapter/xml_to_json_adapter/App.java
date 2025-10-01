package structural_patterns.adapter.xml_to_json_adapter;

public class App {
    public static void main(String[] args) {
        XmlApi xmlApi = new XmlApi();
        DataProvider adapter = new XmlToJsonAdapter(xmlApi);

        System.out.println("Consumindo API em JSON:");
        System.out.println(adapter.getDataAsJson());
    }
}