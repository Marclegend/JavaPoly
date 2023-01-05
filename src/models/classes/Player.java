package models.classes;

import models.classes.Cards.Property;

import java.util.ArrayList;

public class Player {
    protected int id;
    protected String name;
    protected int balance;
    protected int position;
    protected ArrayList<Property> properties;

    public Player(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.position = 0;
        this.properties = new ArrayList<Property>();
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Property property){
        this.properties.add(property);
    }
}
