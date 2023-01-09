package models.classes.board;

import models.Utils.InputInteger;
import models.Utils.InputString;
import models.classes.Cards.Card;
import models.classes.Cards.EventCards.EventCard;
import models.classes.Cards.EventCards.FreeMovementCard;
import models.classes.Cards.PrizeCards.LockedPrizeCard;
import models.classes.Cards.PrizeCards.LossByPropertyCard;
import models.classes.Cards.PrizeCards.PrizeCard;
import models.classes.Cards.Property;
import models.classes.Player;

import java.util.ArrayList;

public class Board{
    protected ArrayList<Property> properties = new ArrayList<>();
    protected ArrayList<EventCard> eventCards = new ArrayList<>();
    protected ArrayList<PrizeCard> prizeCards = new ArrayList<>();
    protected ArrayList<Player> players = new ArrayList<>();
    protected ArrayList<Card> tile = new ArrayList<>();
    protected boolean gameEnded;
    int turn;

    public Board (){
    }

    public void eventCardsGenerator(){
        FreeMovementCard free_plane = new FreeMovementCard("You've won a free plane ticket!", "Free Plane");
        getEventCards().add(free_plane);
    }
    public void prizeCardsGenerator(){
        LockedPrizeCard lottery_obsession = new LockedPrizeCard("You've lost on the lottery! Pay up!", "Lottery Obsession", -300);
        LossByPropertyCard housing_failure = new LossByPropertyCard("Your properties are starting to crumble! Pay up!", "House Crumbling", -40);
        getPrizeCards().add(lottery_obsession);
        getPrizeCards().add(housing_failure);
    }
    public void playerSelection(){
        int numberOfPlayers = InputInteger.inputInteger("How many players?", "Please input an integer");
        String nameOfPlayer;
        for (int i = 0; i < numberOfPlayers; i++){
            nameOfPlayer = InputString.inputString("What's the name of the player " + (i+1)  + "?");
            Player player = new Player(i, nameOfPlayer, 1500 );//We use the number of the player to have unique IDs
            getPlayers().add(player);
        }
        System.out.println(getPlayers());
    }

    public void startGame(){
        eventCardsGenerator();
        prizeCardsGenerator();
        playerSelection();

    }

    public ArrayList<Property> getProperties() {

        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public ArrayList<EventCard> getEventCards() {
        return eventCards;
    }

    public void setEventCards(ArrayList<EventCard> eventCards) {
        this.eventCards = eventCards;
    }

    public ArrayList<PrizeCard> getPrizeCards() {
        return prizeCards;
    }

    public void setPrizeCards(ArrayList<PrizeCard> prizeCards) {
        this.prizeCards = prizeCards;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
