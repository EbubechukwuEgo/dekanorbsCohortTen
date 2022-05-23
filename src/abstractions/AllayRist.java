package abstractions;

import java.io.Serializable;

public class AllayRist implements List, Serializable {
    private int counter = 0;
    private String[] db = new String[5];

    @Override
    public void add(String item) {
        db[counter] = item;
        counter++;
    }

    @Override
    public void add(int index, String item) {
        ;
    }

    @Override
    public String get(int index) {
        return db[index];
    }

    @Override
    public void remove(String item) {
        ;
    }

    @Override
    public void remove(int index) {
        counter--;
    }

    @Override
    public int size() {
        return counter;
    }
}
