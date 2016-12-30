package com.example.bbaitikova.kids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dimention_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dimention_page);

        Button goBackButton = (Button) findViewById(R.id.GoBack); //created 'Go Back' button
        goBackButton.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View view) {
                startActivity(new Intent(dimention_page.this, MainActivity.class));
            }

        });

        Button myButton3x4 = (Button) findViewById(R.id.size1); //created '3x4' button
        myButton3x4.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View view) {
                startActivity(new Intent(dimention_page.this, size_3x4.class));
            }
        });
    }

}
