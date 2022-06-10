package dsa;

import java.util.ArrayList;

public class MakingASet {

    private ArrayList<String> elements = new ArrayList<>();


    public void add(String element) {
        if (!elements.contains(element)){
            elements.add(element);
        } else throw new ContentAlreadyExist("Language already exists.");
    }

    public boolean isEmpty() {
        if (elements.isEmpty()) return true;
        else return false;
    }

    public int size() {
        return elements.size();
    }

    public void clear() {
        elements.clear();
    }

    public void remove(String element) {
        if (elements.contains(element)){
            elements.remove(element);
        }
    }

    public void addAll(MakingASet collection) {

    }
}
