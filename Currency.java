package Kantor;

public enum Currency {

    USD("USD"), PLN("PLN"), EUR("EUR");


    private String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
