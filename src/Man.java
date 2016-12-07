import java.util.Comparator;

public class Man implements Comparable<Man> {
    String name;
    int dateBirthday;
    int documentNumber;

    Man(String name, int dateBirthday, int documentNumber) {
        this.name = name;
        this.dateBirthday = dateBirthday;
        this.documentNumber = documentNumber;
    }

    int getDateBirthday() {
        return dateBirthday;
    }

    int getDocumentNumber() {
        return documentNumber;
    }

    String getName() {
        return name;
    }

    void setDateBirthday(int dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }


    static Comparator<Man> COMPARE_BY_NAME = new Comparator<Man>() {
        @Override
        public int compare(Man name, Man otherName) {
            return name.name.compareTo(otherName.name);
        }
    };

    @Override
    public int compareTo(Man man) {
        return name.compareTo(man.name);
    }


}