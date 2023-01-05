package models.classes.Cards.PrizeCards;

import models.classes.Cards.Card;
import models.classes.Player;
import models.interfaces.Cards;

/*
    MAIN PRIZECARD CLASS, USED TO KNOW HOW MUCH NEEDS TO BE SUM OR SUB FROM THE PLAYER, NEVER TOUCHED FROM HERE
 */
public class PrizeCard extends Card {
    protected String name;
    protected String information;
    protected int prize;

    public PrizeCard(String information, String name, int prize) {
        super(information, name);
        this.prize = prize;
    }

    @Override
    public void information() {
        super.information();
    }

    /*
        Prize cards will always give balance to the Player
     */
    @Override
    public void action(Player player) {
        player.setBalance(getPrize() + player.getBalance());
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getPrize() {
        return prize;
    }

}
