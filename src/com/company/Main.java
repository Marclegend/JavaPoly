package com.company;

import models.classes.Cards.Property;
import models.classes.Player;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Property propertyExample = new Property("This is a property", "Puerta del Sol", 100, 1);
        Player player = new Player(1, "Marc", 110);
        propertyExample.buyProperty(player);
        System.out.println(player.getProperties().get(0));
    }
}
