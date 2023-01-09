package models.classes.Cards.EventCards;

import models.Utils.InputInteger;
import models.classes.Player;

public class FreeMovementCard extends EventCard {
    public FreeMovementCard(String information, String name) {
        super(information, name);
    }

    @Override
    public void action(Player player) {
        setPositionToTransport(InputInteger.inputInteger("Which square do you wanna move to?", "Please input an integer"));
        super.action(player);
    }

    @Override
    public void information() {
        super.information();
    }
}
