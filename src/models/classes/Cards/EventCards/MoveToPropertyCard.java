package models.classes.Cards.EventCards;

import models.Utils.InputInteger;
import models.classes.Cards.Card;
import models.classes.Cards.Property;
import models.classes.Player;
import models.interfaces.Cards;

import java.util.ArrayList;

public class MoveToPropertyCard extends EventCard {
    public MoveToPropertyCard(String information, String name) {
        super(information, name);
    }

    @Override
    public void action(Player player) {
        for (int i = 0; i < player.getProperties().size(); i++) {
            System.out.println((i+1) + "- " + player.getProperties().get(i).getName());
        }
        int propertyToMove = InputInteger.inputIntegerWithRange("Which property do you want to move to? ","Please input from 1 to " + player.getProperties().size() + 1, 1, player.getProperties().size() + 1);
        System.out.println(player.getProperties().get(propertyToMove - 1 ).getName());
        super.action(player);
    }
}
