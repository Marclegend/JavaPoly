package models.classes.Cards.EventCards;

import models.classes.Cards.EventCards.EventCard;
import models.classes.Player;
import models.interfaces.Cards;

public class JailCard extends EventCard {

    /*
    JailCard will need the position where the jail will be at, so that when it is played,
    it can send the Player to the tile that it needs to
 */
    protected int jailPosition;

    /*
        We add in the jailPosition so we know where we need to send the player to
     */
    public JailCard(int positionToTransport, String name, String information, int jailPosition) {
        super(information, name);
        this.jailPosition = jailPosition;
    }

    @Override
    public void information() {
        super.information();
    }

    /*
        We move the player to the position of the Jail, we edit the positionToTransport so that
        the inherited method can use it correctly (action from EventCard sets the playerPosition)
     */
    @Override
    public void action(Player player) {
        setPositionToTransport(getJailPosition());
        super.action(player);
    }

    public int getJailPosition() {
        return jailPosition;
    }
}
