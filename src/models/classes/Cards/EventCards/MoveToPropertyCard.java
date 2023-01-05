package models.classes.Cards.EventCards;

import models.classes.Cards.Card;
import models.classes.Player;
import models.interfaces.Cards;

public class MoveToPropertyCard extends EventCard {
    public MoveToPropertyCard(String information, String name, int positionToTransport) {
        super(information, name, positionToTransport);
    }

    @Override
    public void action(Player player) {
        //TODO: Iterate the player's property list and ask which one does he want to move to
        super.action(player);
    }
}
