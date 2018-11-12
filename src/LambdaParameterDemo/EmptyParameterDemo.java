package LambdaParameterDemo;

public class EmptyParameterDemo {

    public static void main(String[] args) {
           
    // Anonymous Runnable
     Runnable r1 = new Runnable(){
            @Override
            public void run(){
              System.out.println("Hello world one!");
            }
     };
     
     // Lambda Runnable
     Runnable r2 = () -> System.out.println("Hello world two!");
     
     // Run em!
     r1.run();
     r2.run();
     
   }
 }
