import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("GFG");
        h.add("Courses");
        h.add("IDE");

        // System.out.println(h);

        // System.out.println(h.contains("GFG"));

        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);
        // System.out.println(m);
        // System.out.println(m.size());

        for(Map.Entry<String, Integer> e : m.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
