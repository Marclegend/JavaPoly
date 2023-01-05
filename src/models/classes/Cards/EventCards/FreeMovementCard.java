package models.classes.Cards.EventCards;

import models.classes.Player;
import models.interfaces.Cards;

public class FreeMovementCard extends EventCard {
    public FreeMovementCard(String information, String name, int positionToTransport) {
        super(information, name, positionToTransport);
    }

    @Override
    public void action(Player player) {
        /*
            TODO: Implement method to ask the player which tile they wanna move to
         */
        setPositionToTransport(1);
        super.action(player);
    }

    @Override
    public void information() {
        super.information();
    }
}
