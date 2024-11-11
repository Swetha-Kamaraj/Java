import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> Scores=new HashMap<String,Integer>();
        Scores.put("Maths",70);
        Scores.put("Social",98);
        Scores.put("Science",97);
        Scores.put("Tamil",100);

        Scores.putIfAbsent("English",80);
        Scores.replace("Maths", 90);
        System.out.println(Scores.toString());

        System.out.println(Scores.get("Tamil"));
        //we cam also use clear remove getordefault size containsValue etc.....

    }
}
