package adapter.json;

import org.json.JSONObject;

// Existing class used by the Client that could benefit from interacting with a File
public class JSONLogger {
    private JSONEntity jsonFile;

    public JSONLogger(JSONEntity jsonFile) {
        this.jsonFile = jsonFile;
    }

    public void logData(JSONObject jsonData) {
        jsonFile.write(jsonData);
    }
}
