package app.phonebook;

public class Record {

    private String name;
    private String number;


    public Record(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}