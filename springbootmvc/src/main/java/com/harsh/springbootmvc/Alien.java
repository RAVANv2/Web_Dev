package com.harsh.springbootmvc;

public class Alien {
    private int id;
    private String name;

    public Alien(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Alien [id="+id+", name="+name+"]";
    }
}
