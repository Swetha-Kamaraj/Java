public class method {
    //Constructor method
        method(){
            System.out.println("I am inside the constructor");
        }
    public static void main(String[] args) {
        //static method can be called without creating object
        staticMethod();
        method lambo=new method();
        //nonstatic method needs a object
        lambo.nonstaticMethod();
    }
static void staticMethod(){
            System.out.println("I am inside static method");
        }
public void nonstaticMethod(){
            System.out.println("I am inside the non static method");
        
         }
    
}

