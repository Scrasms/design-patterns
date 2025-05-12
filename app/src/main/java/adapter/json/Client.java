package adapter.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class Client {

    public static void main(String[] args) {
        File file = new File();
        file.write("Hello");
        file.append(" World!");
        System.out.println(file.read());
        file.write("Goodbye World!");
        System.out.println(file.read());

        // Adapter allows the logger to log to a File class
        File file2 = new File();
        JSONEntity jsonFile = new JSONFileAdapter(file2);
        JSONLogger logger = new JSONLogger(jsonFile);
        logger.logData(generateJson());

        System.out.println(file2.read());

    }

    public static JSONObject generateJson() {
        JSONObject blackout = new JSONObject();
        blackout.put("type", "project");
        blackout.put("name", "blackout");

        JSONObject dungeonmania = new JSONObject();
        dungeonmania.put("type", "project");
        dungeonmania.put("name", "dungeonmania");

        JSONObject expectedSubgroup = new JSONObject();
        expectedSubgroup.put("name", "22T2");
        expectedSubgroup.put("type", "group");
        expectedSubgroup.put("subgroups", new JSONArray(new JSONObject[] {dungeonmania}));

        JSONObject expected = new JSONObject();
        expected.put("name", "COMP2511");
        expected.put("type", "group");
        expected.put("subgroups", new JSONArray(new JSONObject[] {expectedSubgroup, blackout}));

        return expected;
    }
}
