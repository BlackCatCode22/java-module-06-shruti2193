package shruti.zoo.com;

import java.util.ArrayList;

public class AnimalNameListsWrapper {

    private ArrayList<String> hyenaNameList;
    private ArrayList<String> lionNameList;
    private ArrayList<String> tigerNameList;
    private ArrayList<String> bearNameList;

    // Constructor to initialize all the name lists
    public AnimalNameListsWrapper(ArrayList<String> hyenaNameList,
                                  ArrayList<String> lionNameList,
                                  ArrayList<String> tigerNameList,
                                  ArrayList<String> bearNameList) {
        this.hyenaNameList = hyenaNameList;
        this.lionNameList = lionNameList;
        this.tigerNameList = tigerNameList;
        this.bearNameList = bearNameList;
    }

    // Getter for Hyena name list
    public ArrayList<String> getHyenaNameList() {
        return hyenaNameList;
    }

    // Getter for Lion name list
    public ArrayList<String> getLionNameList() {
        return lionNameList;
    }

    // Getter for Tiger name list (added)
    public ArrayList<String> getTigerNameList() {
        return tigerNameList;
    }

    // Getter for Bear name list (added)
    public ArrayList<String> getBearNameList() {
        return bearNameList;
    }
}


