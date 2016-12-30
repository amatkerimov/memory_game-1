package com.example.bbaitikova.kids;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import static com.example.bbaitikova.kids.R.styleable.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) //Bundle is a very special object that hols all of the states of the activity.
            //savedInstanceState is not a special Android Studio method/class - can be renamed.
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //layout (XML) view that we want to show to user when app is launched.

        ImageButton playButton = (ImageButton) findViewById(R.id.playButton); //we define a new button using id from XML.
        playButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, dimention_page.class)); //you use Intent to open a new window or activity.
                //so here we indicate the current activity on which button is located and the 2nd parameter is the name of the
                //another activity to which the Intent of a button leads.
            }
        });


        final Switch onOffSwitch = (Switch)  findViewById(R.id.soundSwitch);
        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {


            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    onOffSwitch.setText("Off");  //To change the text near to switch
                    Log.d("You are :", "Checked");
                }
                else {
                    onOffSwitch.setText("On");   //To change the text near to switch
                    Log.d("You are :", " Not Checked");
                }


                }



        });


    }

}



