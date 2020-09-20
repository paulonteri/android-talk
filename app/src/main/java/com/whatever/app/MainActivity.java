package com.whatever.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // handles all the logic
    private Button myButton;
    private TextView myTitle, myNumber;

    // code that will run when the user is on the activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.myButton);
        myTitle =  findViewById(R.id.myTitle);
        myNumber = findViewById(R.id.myNumber);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // is run whenever you click the button

                Integer myFigure = 5 + Integer.parseInt((String) myNumber.getText());

                myNumber.setText(myFigure.toString());

            }
        });






    }
}