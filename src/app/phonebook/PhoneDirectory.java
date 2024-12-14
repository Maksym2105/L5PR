package app.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {

    private List<Record> records;

   public PhoneDirectory() {
       records = new ArrayList<>();
   }

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> result = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equalsIgnoreCase(name)) {
                result.add(record);
            }
        }
        return result.isEmpty() ? null : result;
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "records=" + records +
                '}';
    }
}