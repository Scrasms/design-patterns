package adapter.json;

import org.json.JSONObject;

public class JSONFileAdapter implements JSONEntity {
    private File file;

    public JSONFileAdapter(File file) {
        this.file = file;
    }

    @Override
    public void write(JSONObject jsonData) {
        file.write(jsonToString(jsonData));
    }

    @Override
    public void append(JSONObject jsonData) {
        file.append(jsonToString(jsonData));
    }

    @Override
    public JSONObject read() {
        return new JSONObject(file.read());
    }


    // If we weren't using a library, we would implement this ourselves in the Adapter class
    private String jsonToString(JSONObject jsonData) {
        return jsonData.toString();
    }
}
