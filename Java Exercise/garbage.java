
// public class garbage{
//     public static void main(String s[]) throws Exception{
//         Runtime rs=Runtime.getRuntime();
//         System.out.println("before garbage collection"+rs.freeMemory());
//         rs.gc();
//         System.out.println("After garbage collection"+rs.freeMemory());

//     }
// }

//Program to get own Ip address

// import java.net.*;
// public class garbage{
//     public static void main(String[] args) throws Exception {
//         System.out.println(InetAddress.getLocalHost());
//     }
// }

import java.io.*;
public class garbage{
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Runtime rs=Runtime.getRuntime();
        try{
            rs.exec("notepad");
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}