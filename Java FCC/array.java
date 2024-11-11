// import java.util.Arrays;
// public class array {
//     public static void main(String[] args) {
//         char vowels[]=new char[5]; //object String
//         vowels[0]='a';
//         vowels[1]='e';
//         vowels[2]='i';
//         vowels[3]='0';
//         vowels[4]='u';
//         System.out.println(Arrays.toString(vowels));

//     }
// }
// import java.util.Arrays;
// public class array {
//     public static void main(String[] args) {

//         char vowels[]={'a','e','i','o','u'};
//         System.out.println(vowels.length);
 //           Arrays.fill(vowels,staringIndex,endingIndex,'x');
//         int number[]={3,4,1,2,6,5};
//         int startingIndex=1;
//         int endingIndex=6;
//         Arrays.sort(number,startingIndex,endingIndex);
//         System.out.println(Arrays.toString(number));

//     }
// }
// import java.util.Arrays;
// public class array {
//     public static void main(String[] args) {

//         char vowels[]={'a','e','i','o','u'};
//         Arrays.sort(vowels);
//         char key='e';
// //         int startingIndex=1;
// //         int endingIndex=4;
       
//         int ItemfoundIndex= Arrays.binarySearch(vowels,/*startingIndex,endingIndex,*/key);
//         System.out.println(Arrays.toString(vowels));
//         System.out.println(ItemfoundIndex);

//     }}
// import java.util.Arrays;
// public class array{
//     public static void main(String[] args) {
//         int number[]={1,2,3,4,5,6};
//        //copyOf function is used to make the acutual copy of the array 
//        // int copyOfnumber[]=number; this line does't acutually makes copy but it points to the original arrays
        
//        //copyOfRange is used to use starting index and ending index
//        int copyOfnumbers[]=Arrays.copyOf(number,number.length /*10 */);

//         Arrays.fill(number,0);
//         System.out.println(Arrays.toString(number));
//         System.out.println(Arrays.toString(copyOfnumbers));
//     }
// }
class array {
    public static void main(String[] args) {
    for (String t: args) {
    System.out.println(t);
    }
    }
    }