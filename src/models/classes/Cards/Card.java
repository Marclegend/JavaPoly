package models.classes.Cards;

import models.classes.Player;
import models.interfaces.Cards;

/*
    MAIN CLASS FOR ALL THE CARDS, CONTAINS BASIC INFORMATION TO THEN BE DISPLAYED ON THE FRONT AND CONSOLE
 */
public class Card implements Cards {
    protected String information;
    protected String name;

    public Card(String information, String name) {
        this.information = information;
        this.name = name;
    }

    @Override
    public void information() {
        System.out.println(this.information);
    }

    @Override
    public void action(Player player) {

    }
}
