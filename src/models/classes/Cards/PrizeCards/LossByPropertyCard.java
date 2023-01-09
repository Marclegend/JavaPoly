package models.classes.Cards.PrizeCards;

import models.classes.Cards.Property;
import models.classes.Player;
import models.interfaces.Cards;

public class LossByPropertyCard extends PrizeCard {
    public LossByPropertyCard(String information, String name, int prize) {
        super(information, name, prize);
    }

    @Override
    public void action(Player player) {
        setPrize(player.getProperties().size() * -30);
        super.action(player);
    }
}
