import java.util.ArrayList;
import java.util.Comparator;
public class arraylist {
    public static void main(String[] args) {
        //Integer is the wrapper class for the primitive datatype int(reference type for the int)
       ArrayList<Integer> number=new ArrayList<Integer>() ;
       number.add(1);
       number.add(2);
       number.add(3);
       number.add(4);
       number.add(5);
       number.add(6);

       number.remove(5);
       number.remove(Integer.valueOf(5));
       //number.clear();

       number.set(1,Integer.valueOf(5));
       number.sort(Comparator.naturalOrder());
       //number.sort(Comparator.reverseOrder());

       System.out.println(number.contains(Integer.valueOf(3)));

       System.out.println(number.toString());
       System.out.println(number.get(1));
       //System.out.println(number.isEmpty());
    }
}
