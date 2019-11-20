package LambdaKataFacit;

import org.junit.Test;
import java.util.List;
import java.util.Map;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

/*

Partition adults and kids

 */

public class PartitioningTest {

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {

        LambdaKataFacit.Person sara = new LambdaKataFacit.Person("Sara", 4);
        LambdaKataFacit.Person viktor = new LambdaKataFacit.Person("Viktor", 40);
        LambdaKataFacit.Person eva = new LambdaKataFacit.Person("Eva", 42);
        List<LambdaKataFacit.Person> collection = asList(sara, eva, viktor);
        Map<Boolean, List<LambdaKataFacit.Person>> result = 
                LambdaKataFacit.Partitioning.partitionAdults(collection);
        
        assertTrue(result.get(true).size() == 2 );
        assertTrue(result.get(false).size() == 1 );
        assertTrue(result.get(true).contains(eva));
        assertTrue(result.get(true).contains(viktor));
        assertTrue(result.get(false).contains(sara));

    }



}