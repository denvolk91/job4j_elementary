package main.java.ru.job4j.oop;

public class Engineer extends Profession {

    private String invention;
    private String placeOfWork;
    private String client;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getInvention() {
        return invention;
    }

    public void setInvention(String invention) {
        this.invention = invention;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
}
