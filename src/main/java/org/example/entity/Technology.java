package org.example.entity;


public class Technology {
    private int id;
    private String name;
    private ProgrammingLanguage programmingLanguage;

    public Technology(int id, String name, ProgrammingLanguage programmingLanguage) {
        this.id = id;
        this.name = name;
        this.programmingLanguage = programmingLanguage;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public ProgrammingLanguage getProgrammingLanguage() { return programmingLanguage; }

    @Override
    public String toString() {
        return "Technology{id=" + id + ", name='" + name + "', language=" + programmingLanguage.getName() + "}";
    }
}
