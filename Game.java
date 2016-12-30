package com.example.bbaitikova.kids;

//Creates a grid
//Starts Game
//Ends Game
//Keeps Score
// Responds to card selection

public class Game
{
    private Grid grid;
    private int score;

    public Game()
    {
        // initialise instance variables
    }
    public void start()
    {
        grid = new Grid(25);
        grid.shuffle();
        score = 0;
    }
    public void end()
    {

    }
    public void cardSelected(int cardNumber)
    {
        grid.getCard(cardNumber).flip();
        //If 2 cards selected then check equals and incr score
    }



}
