package models.classes.Cards.PrizeCards;

import models.classes.Player;

public class LockedPrizeCard extends PrizeCard {

    public LockedPrizeCard(String information, String name, int prize) {
        super(information, name, prize);
    }

    /*
        We set the desired prize from the prizeToSet so that the inherited method can reward the player
        with the locked prize that we want
     */
    @Override
    public void action(Player player) {
        super.action(player);
    }

    @Override
    public void information() {
        super.information();
    }


}
