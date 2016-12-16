import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;


public class PersonTest {
    Person personPetya = new Person("Petya", 29,2,1988, 88995566);
    Person personJora = new Person("Jora", 30,7,1990, 88995577);
    Person personAlice = new Person("Alice", 15,5,1980, 88999977);
    Person personJulya = new Person("Juliya", 23,12,1980, 77999977);
    Person personIt = new Person("It", 12,11,1980, 88992277);

    @Test
    public void testEquals() throws Exception {
        List<Person> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Person[]{personPetya, personJora, personAlice, personJulya, personIt}));
        Collections.sort(array, Person.COMPARE_BY_NAME);
        List<Person> testArray = new ArrayList<>();
        testArray.addAll(Arrays.asList(new Person[]{personAlice, personIt, personJora, personJulya, personPetya}));
        assertArrayEquals(array.toArray(),testArray.toArray());

    }

    @Test
    public void testGet() throws Exception {
        assertTrue(personAlice.getName().equals("Alice"));
        assertTrue(personAlice.getDateBirthday().equals(LocalDate.of(1980,5,15)));
        assertTrue(personAlice.getDocumentNumber() == 88999977);
    }
    @Test
    public void testSet() throws Exception {
        personAlice.setName("Nu");
        assertTrue(personAlice.getName().equals("Nu"));
        personAlice.setDateBirthday(LocalDate.of(1988,5,15));
        assertTrue(personAlice.getDateBirthday().equals(LocalDate.of(1988,5,15)));
        personAlice.setDocumentNumber(88999978);
        assertTrue(personAlice.getDocumentNumber() == 88999978);
    }

}