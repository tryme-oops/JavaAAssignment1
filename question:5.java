
import java.io.FileReader;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Object root = new JSONParser().parse(new FileReader("JsonFile.json"));
        JSONObject obj = (JSONObject) root;
        
//         part1
        JSONArray labs = (JSONArray) obj.get("labs");
        HashMap<String, String> labsMap = new HashMap<String, String>();
        for(int i=0;i<labs.size();i++) {
            JSONObject lab = (JSONObject) labs.get(i);
            if(lab.get("time").equals("Today")) {
                labsMap.put((String) lab.get("name"), (String) lab.get("location"));
            }
        }
        System.out.println("Labs -> ");
        System.out.println(labsMap);
      

//        part2  
        JSONArray medications = (JSONArray) obj.get("medications");
        HashMap<String, String> medicationsMap = new HashMap<String, String>();
        Iterator i = medications.iterator();
        while(i.hasNext()) {
            Iterator<Map.Entry> i1 = ((Map) i.next()).entrySet().iterator();
            while(i1.hasNext()) {
                Map.Entry pair = i1.next();
                JSONArray ar = (JSONArray) pair.getValue();
                for(int j=0;j<ar.size();j++) {
                    JSONObject medication = (JSONObject) ar.get(j);
                    if(medication.get("route").equals("PO")) {
                        medicationsMap.put((String) medication.get("name"), (String) medication.get("strength"));
                    }
                }
            }
        }
        System.out.println("Medications -> ");
        System.out.println(medicationsMap);
        
    }
}
