package models.classes.Cards.PrizeCards;

import models.classes.Player;
import models.interfaces.Cards;

public class LockedPrizeCard extends PrizeCard {
    protected int prizeToSet;

    public LockedPrizeCard(String information, String name, int prize, int prizeToSet) {
        super(information, name, prize);
        this.prizeToSet = prizeToSet;
    }

    /*
        We set the desired prize from the prizeToSet so that the inherited method can reward the player
        with the locked prize that we want
     */
    @Override
    public void action(Player player) {
        setPrize(getPrizeToSet());
        super.action(player);
    }

    @Override
    public void information() {
        super.information();
    }

    public int getPrizeToSet() {
        return prizeToSet;
    }

}
