package core.lesson17;

public enum Lang {

    ARM("Հայաստան", 1),
    RU("ՌԴ"),
    ENG("ԱՄՆ");

    private String countryName;
    private int count;

    Lang(String countryName) {
        this.countryName = countryName;
    }

    Lang(String countryName, int count) {
        this.countryName = countryName;
        this.count = count;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCount() {
        return count;
    }
}
