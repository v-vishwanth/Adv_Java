package com.lpu;

import jakarta.persistence.*;

@Entity
@Table(name = "engine")
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;
    private int horsepower;
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getHorsepower() { return horsepower; }
    public void setHorsepower(int horsepower) { this.horsepower = horsepower; }
}
