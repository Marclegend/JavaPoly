package models.classes.Cards;

import models.Utils.InputInteger;
import models.classes.Player;
import models.interfaces.Cards;

public class Property extends Card implements Cloneable {
    protected int id;
    protected String name;
    protected int price;
    protected Player owner;

    public Property(String information, String name, int price, int id) {
        super(information, name);
        this.price = price;
        this.id = id;
    }

    /*
        We will check the balance of the player, once done we will charge him the ammount required
     */
    public void chargePlayer(Player playerToPay){
        if (playerToPay.getBalance() > this.price){
            //TODO: Get the player from the board by getting the Owner's ID
            playerToPay.setBalance(playerToPay.getBalance() - this.price);
        } else {
            //TODO: Dar la opción de vender propiedades con tal de poder salvarse
            System.out.println("The player " + playerToPay.getName() + " has lost the game ");
        }
    }

    /*
        We will check if the player has enough balance to buy the property, and then set his [properties]
        aswell as changing the [owner] of the Property
     */
    public void buyProperty(Player player) {
        if (player.getBalance() > this.price) { //We check that we have enough balance to buy the property
            this.owner = player;
            player.setBalance(player.getBalance() - this.price);
            try {
                player.addProperty((Property) this.clone());
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("The player can not buy the property");
        }
    }

    @Override
    public void action(Player player) {
        if (getOwner() != null){
            switch (InputInteger.inputInteger("Do you want to buy the property? 1- Yes 2- No", "put a number")){
                case 1:
                    buyProperty(player);
                    break;
                case 2:
                    //TODO: Put on sale so other players can buy the properties
                    System.out.println("Player doesnt buy the Property, it will go on sale now");
                    break;
                default:
                    break;
            }
        } else {
            player.setBalance(this.price);
            this.owner.setBalance(this.price);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
