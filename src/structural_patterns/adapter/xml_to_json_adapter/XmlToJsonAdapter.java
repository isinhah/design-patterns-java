package structural_patterns.adapter.xml_to_json_adapter;

public class XmlToJsonAdapter implements DataProvider {
    private final XmlApi xmlApi;

    public XmlToJsonAdapter(XmlApi xmlApi) {
        this.xmlApi = xmlApi;
    }

    @Override
    public String getDataAsJson() {
        String xml = xmlApi.getDataAsXml();
        return "{ \"name\": \"isabel\", \"age\": 20 }";
    }
}
