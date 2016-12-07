import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;


public class ManTest {

    @Test
    public void testEquals() throws Exception {
        Man manPetya = new Man("Petya", 2921988, 88995566);
        Man manJora = new Man("Jora", 3071990, 88995577);
        Man manAlice = new Man("Alice", 1551980, 88999977);
        Man manJulya = new Man("Juliya", 23121980, 77999977);
        Man manIt = new Man("It", 12111980, 88992277);
        List<Man> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Man[]{manPetya, manJora, manAlice, manJulya, manIt}));
        Collections.sort(array,Man.COMPARE_BY_NAME);
        List<Man> testArray = new ArrayList<>();
        testArray.addAll(Arrays.asList(new Man[]{manAlice,manIt,manJora,manJulya,manPetya}));
        assertArrayEquals(array.toArray(),testArray.toArray());

    }
}