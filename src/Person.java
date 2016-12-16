import java.time.LocalDate;
import java.util.Comparator;

public class Person implements Comparable<Person> {
    String name;
    LocalDate dateBirthday;
    int documentNumber;

    public Person(String name, int day, int month, int year, int documentNumber) {
        this.name = name;
        this.dateBirthday = LocalDate.of(year, month, day);
        this.documentNumber = documentNumber;
    }

    public LocalDate getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Comparator<Person> COMPARE_BY_NAME = new Comparator<Person>() {
        @Override
        public int compare(Person name, Person otherName) {
            return name.name.compareTo(otherName.name);
        }
    };

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }


}