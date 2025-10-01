package structural_patterns.adapter.xml_to_json_adapter;

// Ex: Serviço que só retorna XML
public class XmlApi {
    public String getDataAsXml() {
        return "<user><name>isabel</name><age>20</age></user>";
    }
}