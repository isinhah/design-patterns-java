package structural_patterns.adapter.xml_to_json_adapter;

// Interface que o cliente espera
public interface DataProvider {

    // Ex: Serviço que retorna apenas JSON
    String getDataAsJson();
}