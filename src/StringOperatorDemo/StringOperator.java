package StringOperatorDemo;


public interface StringOperator {
    String apply(String input);
    
    default StringOperator andThen(StringOperator after){
        return s -> after.apply(apply(s));
    }
    
    static StringOperator identity(){
        return t -> t;
    }

}
