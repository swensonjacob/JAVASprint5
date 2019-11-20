package LambdaKata;


import org.junit.Test;
import java.util.List;
import static java.util.Arrays.asList;
import java.util.IntSummaryStatistics;
import static org.junit.Assert.assertTrue;


/*

Get people statistics: average age, count, maximum age, minimum age and sum og all ages.

 */

public class GetStatsTest {

    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    List<Person> collection = asList(sara, eva, viktor);
    IntSummaryStatistics stats = GetStats.getStats(collection);

    @Test
    public void getStatsShouldReturnAverageAge() {
        assertTrue(stats.getAverage() == (double)(4 + 40 + 42) / 3);
    }

    @Test
    public void getStatsShouldReturnNumberOfPeople() {
        assertTrue(stats.getCount() == 3);
    }

    @Test
    public void getStatsShouldReturnMaximumAge() {
        assertTrue(stats.getMax() == 42);
    }

    @Test
    public void getStatsShouldReturnMinimumAge() {
        assertTrue(stats.getMin() == 4);
    }
    
    @Test
    public void getStatsShouldReturnSumOfAllAges() {
        assertTrue(stats.getSum() == 40 + 42 + 4);
    }

}
