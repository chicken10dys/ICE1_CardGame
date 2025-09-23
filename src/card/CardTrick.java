/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Set;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Ashton Gon
 */
public class CardTrick {
  
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        int cardValue;
        int cardSuit;
        boolean isFound = false;

      
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int)( 1 + Math.random() * 14));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
            System.out.println(c.getSuit() +" " + c.getValue());
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Enter a card value (1-13): ");
        cardValue = scanner.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        cardSuit = scanner.nextInt();
        
        // and search magicHand here
        for(int i = 0; i < magicHand.length; i++){
            if (magicHand[i].getValue() == cardValue && magicHand[i].getSuit().equals( Card.SUITS[cardSuit]))
            {
                isFound = true;
                break;
            }
        }
        
         
        //Then report the result here
        if (isFound)
            System.out.println("Card is in magichand");
        else
            System.out.println("Card is not in magichand");

    }
    
}
