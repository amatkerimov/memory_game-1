package com.example.bbaitikova.kids;
import java.util.Random;

// Grid class
//Creates the cards
// Shuffles the cards
//


public class Grid
{
    private Card[] cards;

    public Grid(int numberOfCards)
    {
        cards = new Card[numberOfCards];

        Random gen = new Random();
        for(int i=0; i < numberOfCards; i+=2)
        {
            cards[i] = new Card(gen.nextInt(4), gen.nextInt(13) + 1);
            cards[i+1] = new Card(gen.nextInt(4), gen.nextInt(13) + 1);
        }

        if(numberOfCards%2 != 0)
            cards[cards.length - 1] = new Card(gen.nextInt(4), gen.nextInt(13) + 1);
    }
    public void shuffle()
    {
        Random gen = new Random();
        for(int i=0; i < cards.length * 2; i++)
        {
            Card tempCard;
            int randomIdx1 = gen.nextInt(cards.length);
            int randomIdx2 = gen.nextInt(cards.length);

            tempCard = cards[randomIdx1];
            cards[randomIdx1] = cards[randomIdx2];
            cards[randomIdx2] = tempCard;
        }
    }
    public Card getCard(int index)
    {
        return cards[index];
    }
}
