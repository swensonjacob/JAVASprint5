package ÖvnUppg2_FunctionalInterfaceFacit;


public class MathOperationMain {

   private static int operate(int a, int b, MathOperation mathOperation) {
      return mathOperation.operation(a, b);
   }
    
   public static void main(String args[]) {
      //with type declaration
      MathOperation addition = (int a, int b) -> a + b;
		
      //with out type declaration
      MathOperation subtraction = (a, b) -> a - b;
		
      //with return statement along with curly braces
      MathOperation multiplication = (int a, int b) -> { return a * b; };
		
      //without return statement and without curly braces
      MathOperation division = (int a, int b) -> a / b;
		
      System.out.println("10 + 5 = " + operate(10, 5, addition));
      System.out.println("10 - 5 = " + operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + operate(10, 5, division));
      
      System.out.println(addition.operation(1,2));
      System.out.println(subtraction.operation(1,2));
      System.out.println(multiplication.operation(1,2));
      System.out.println(division.operation(1,2));
      
      //Uppgift 2b
      MathOperation justTesting = addition.add(subtraction);
      System.out.println(justTesting.operation(10,5));
		
   }
}
