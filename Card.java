package com.example.bbaitikova.kids;

//Card class
//Stores the cards value/id
// Flips the card
// Stores the state of the card (face-up, face-down, hidden)
// Checks if the card is equal to another card
// Hides the card


public class Card extends size_3x4
{
    private int pair_id;
    private int unique_id;
    private int state;

    public Card(int unique_id, int pair_id)
    {
        this.pair_id = pair_id;
        this.unique_id = unique_id;
        state = 1;  //In face down state
    }
    public void flip()
    {
        if(state == 0)
            state = 1;
        else if(state == 1)
            state = 0;
    }

    public boolean equals(Card anotherCard)
    {
        if((anotherCard.getId() == unique_id) && (anotherCard.getValue() == pair_id))
            return true;
        return false;
    }

    Card lions_1 = new Card (1, 1);
    Card lions_2 = new Card (2, 1);
    Card cougars_1 = new Card (3, 2);
    Card cougars_2 = new Card (3,3);

    public void hide()
    {
        state = 2;
    }

    public int getId()
    {
        return unique_id;
    }

    private int getValue()
    {
        return pair_id;
    }


}
