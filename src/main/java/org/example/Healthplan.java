// Healthplan Class
package org.example;

public class Healthplan {
    private int id;
    private String name;
    private org.example.enums.plan plan;

    public Healthplan(int id, String name, org.example.enums.plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
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

    public org.example.enums.plan getPlan() {
        return plan;
    }

    public void setPlan(org.example.enums.plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
}