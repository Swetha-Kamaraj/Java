
public class staticblock {
    public static void main(String[] args) {
        //display is called without object due to static funtion
        display();
        staticblock cd=new staticblock();
        //show is called using the object
        cd.show();
    }

    
        static void display(){
            System.out.println("I am inside display");
        }
        void show(){
            System.out.println("I am inside the show function");
        }
        
    }

