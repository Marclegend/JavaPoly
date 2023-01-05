package models.classes.Cards.PrizeCards;

import models.classes.Player;
import models.interfaces.Cards;

public class LossByPropertyCard extends PrizeCard {
    public LossByPropertyCard(String information, String name, int prize) {
        super(information, name, prize);
    }

    @Override
    public void action(Player player) {
        //TODO: Get the length of player's Arraylist of properties and multiply them by 30, then set the prize
        setPrize(-30);
        super.action(player);
    }
}
