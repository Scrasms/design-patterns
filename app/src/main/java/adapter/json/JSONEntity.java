package adapter.json;

import org.json.JSONObject;

public interface JSONEntity {
    public void write(JSONObject jsonData);

    public void append(JSONObject jsonData);

    public JSONObject read();
}
