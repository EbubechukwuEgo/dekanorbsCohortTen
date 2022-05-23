package chapter8;

public enum Region {
    NE("Russia", "China", "Japan"),
    SE("Australia", "Indonesia"),
    SW("Brazil", "Argentina", "Chile", "Bolivia"),
    NC("Morocco", "Egypt", "Libya"),
    SS("Zambia", "South Africa", "Comoros"),
    NW("USA", "Canada");

    private String[] states;

    Region(String... states){
        this.states = states;
    }
}