package StringOperatorDemo;


public class StringOperatorDemo {
    
    public static void print(StringOperator sp, String s){
        System.out.println(sp.apply(s));
    }

    public static void main(String[] args){
        StringOperator f1 = s -> s.substring(2);
        StringOperator f2 = s -> s.replace(s.charAt(0), 
                s.charAt(s.length() -1));
        
//        print(f1, "En jättelång sträng");
//        print(f2, "En jättelång sträng");
        
//        print(s -> s.substring(2), "En jättelång sträng");
//        print(s -> s.replace(s.charAt(0), s.charAt(s.length() -1)), 
//                "En jättelång sträng");
        
//        print(f1.andThen(f2), "En jättelång sträng");
//        print(f2.andThen(f1), "En jättelång sträng");
//        
        StringOperator f3 = StringOperator.identity();
        System.out.println(f3.apply("Identitiesexempel 1"));
        print(f3, "Identitiesexempel 2");
        print(StringOperator.identity(), "Identitiesexempel 3");
    }
}
