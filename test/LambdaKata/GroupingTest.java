package LambdaKata;


import LambdaKataFacit.*;
import org.junit.Test;
import java.util.List;
import java.util.Map;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;


/*
Group people by nationality
 */
public class GroupingTest {

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        
        LambdaKataFacit.Person sara = new LambdaKataFacit.Person("Sara", 4, "Norwegian");
        LambdaKataFacit.Person viktor = new LambdaKataFacit.Person("Viktor", 40, "Serbian");
        LambdaKataFacit.Person eva = new LambdaKataFacit.Person("Eva", 42, "Norwegian");
        List<LambdaKataFacit.Person> collection = asList(sara, eva, viktor);
        Map<String, List<LambdaKataFacit.Person>> result = 
                LambdaKataFacit.Grouping.groupByNationality(collection);
        
        assertTrue(result.get("Norwegian").size() == 2 );
        assertTrue(result.get("Serbian").size() == 1 );
        assertTrue(result.get("Norwegian").contains(eva));
        assertTrue(result.get("Serbian").contains(viktor));
        assertTrue(result.get("Norwegian").contains(sara));
       
    }

}
