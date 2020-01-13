/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aksal
 */
public class card {
    private int value;
    private String suit;


    public String getSuit() {
        return suit;

        

    public card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

   

    public void setSuit(String suit) {
        if (suit.equals("Spades") || suit.equals("Diamonds") || suit.equals("Heart") || suit.equals("clubs"));
    }

    public void setvalue(int i) {
        if (i > 0 || i < 14) {
            this.value = i;
        } else {
            System.out.println("Invalid input ");
        }

    }

    public int getvalue() {
        return value;
    }

    public String getsuit() {

        return suit;
    }
}
