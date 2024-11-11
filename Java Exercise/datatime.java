// import java.util.*;
// public class datatime {
//     public static void main(String[] args) {
        
//     int day,month,year;
//     int second,minutes,hours;

//     GregorianCalendar date=new GregorianCalendar();

    
//     day=date.get(Calendar.DAY_OF_MONTH);
//     month=date.get(Calendar.MONTH);
//     year=date.get(Calendar.YEAR);
//     second=date.get(Calendar.SECOND);
//     minutes=date.get(Calendar.MINUTE);
//     hours=date.get(Calendar.HOUR);


//     System.out.println("The date is "+day+"/"+month+"/"+year);
//     System.out.println("The time is "+hours+":"+minutes+":"+second);

// }
// }
public class datatime{
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        System.out.println(date);

    }
}