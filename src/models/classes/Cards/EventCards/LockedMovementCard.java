package models.classes.Cards.EventCards;

import models.classes.Cards.Card;
import models.classes.Player;
import models.interfaces.Cards;

public class LockedMovementCard extends EventCard{
    protected int lockedPosition;
    public LockedMovementCard(String information, String name, int positionToTransport, int lockedPosition) {
        super(information, name);
        positionToTransport = this.lockedPosition;
    }

    /*
        We set the positionToTransport to the lockedPosition (we can choose which Tile we want the player
        to be moved to)
     */
    @Override
    public void action(Player player) {
        setPositionToTransport(getLockedPosition());
        super.action(player);
    }

    public int getLockedPosition() {
        return lockedPosition;
    }
}
