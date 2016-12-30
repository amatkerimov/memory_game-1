package com.example.bbaitikova.kids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;


public class size_3x4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_3x4);

        ImageButton col3_row1 = (ImageButton) findViewById(R.id.col3_row1);
        col3_row1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });

        ImageButton col3_row2 = (ImageButton) findViewById(R.id.col3_row2);
        col3_row2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });

        ImageButton col3_row3 = (ImageButton) findViewById(R.id.col3_row3);
        col3_row3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });

        ImageButton col3_row4 = (ImageButton) findViewById(R.id.col3_row4);
        col3_row4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });

        ImageButton col2_row1 = (ImageButton) findViewById(R.id.col2_row1);
        col2_row1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });

        ImageButton col2_row2 = (ImageButton) findViewById(R.id.col2_row2);
        col2_row2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });

        ImageButton col2_row3 = (ImageButton) findViewById(R.id.col2_row3);
        col2_row3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });

        ImageButton col2_row4 = (ImageButton) findViewById(R.id.col2_row4);
        col2_row4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });

        ImageButton col1_row1 = (ImageButton) findViewById(R.id.col1_row1);
        col1_row1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });

        ImageButton col1_row2 = (ImageButton) findViewById(R.id.col1_row2);
        col1_row2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });

        ImageButton col1_row3 = (ImageButton) findViewById(R.id.col1_row3);
        col1_row3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });

        ImageButton col1_row4 = (ImageButton) findViewById(R.id.col1_row4);
        col1_row4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //here should be flipping functionality of the card
            }
        });
    }


}


//pseudo code:
//Card class
//Stores the cards value/id
// Flips the card
// Stores the state of the card (face-up, face-down, hidden)
// Checks if the card is equal to another card
// Hides the card
//
// Grid class
//Creates the cards
// Shuffles the cards
//
// Game class
//Creates a grid
//Starts Game
//Ends Game
//Keeps Score
// Responds to card selection

/*
1) User selects 1st card. (USER ACTION)
2) 1st Card flips revealing the image.
3) User selects 2nd card. (USER ACTION)
4) 2nd Card flips revealing the image.
5) If 1st Card = 2nd Card, then they disappear.
    If 1st card != 2nd Card, they flip back.
6) Repeat.
7) If no cards left, then game ends.

Cards, by definition, are touchable images. When one is clicked, it must be substituted with another by flipping.
 */