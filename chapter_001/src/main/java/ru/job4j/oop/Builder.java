package main.java.ru.job4j.oop;

public class Builder extends Engineer {

    private String project;
    private String build;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }
}
