package LambdaKata;


import LambdaKata.Joining;
import LambdaKata.Person;
import org.junit.Test;
import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;


/*
Return people names separated by comma
 */
public class JoiningTest {

    @Test
    public void toStringShouldReturnPeopleNamesSeparatedByComma() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, viktor, eva);
        String result = Joining.namesToString(collection);
        
        assertEquals(result, "Names: Sara, Viktor, Eva.");
    }

}
