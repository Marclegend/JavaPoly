package models.classes.Cards.EventCards;
import models.classes.Cards.Card;
import models.classes.Player;
import models.interfaces.Cards;

/*/
    MAIN EVENT CLASS, USED TO TELL WHICH ACTION WILL BE DONE, FROM HERE ON THE ACTION METHOD IS NEVER TOUCHED
 */
public class EventCard extends Card {
    /*
        The position where the player will be transported
     */
    protected int positionToTransport;

    /*
        EventCard heritage comes from Card, which has the info and the name
     */
    public EventCard(String information, String name, int positionToTransport) {
        super(information, name);
        this.positionToTransport = positionToTransport;
    }


    /*
        We move the player to the position of the card (this is the default and won't be used!!)
     */
    @Override
    public void action(Player player){
        player.setPosition(getPositionToTransport());
    }

    @Override
    public void information() {
        super.information();
    }

    public int getPositionToTransport() {
        return positionToTransport;
    }

    public void setPositionToTransport(int positionToTransport) {
        this.positionToTransport = positionToTransport;
    }
}
