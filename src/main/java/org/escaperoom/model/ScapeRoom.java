package org.escaperoom.model;

public class ScapeRoom {

    private int id;
    private String name;

    public ScapeRoom() {
    }

    public ScapeRoom(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EscapeRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
