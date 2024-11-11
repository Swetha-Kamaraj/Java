// public class stringformat {
//     public static void main(String[] args) {
//         String name="Swetha";
//         String country="India";
//         int age=20;
//         double gpa=8.36;
//         String formattedstring=String.format("I am %s.I am from %s.I am %d years old and I got %f gpa",name ,country,age,gpa);
//         System.out.println(formattedstring);//%c used for char %b is used for boolean
//     }
// }
// public class stringformat{
//     public static void main(String[] args) {
//         String name="Swetha Kamaraj";
//         System.out.println(name.length());
//         System.out.println(name.isEmpty());
//         System.out.println(name.isBlank());
//         System.out.println(name.toLowerCase());
//     }
// }
// public class stringformat{
//     public static void main(String[] args) {
//         String name1=new String("Swetha");
//         String name2=new String("Swetha");
//         String name3=new String("Swetha");
//         String name4=new String("swetha");
//         System.out.println(name1.equals(name2));
//         System.out.println(name3.equalsIgnoreCase(name4));
//     }
// }
public class stringformat{
    public static void main(String args[]){
        String word="Swetha is talented";
        String updatedstring=word.replace("talented","beauty");
        System.out.println(updatedstring);
        System.out.println(word.contains("Swetha"));
    }
}