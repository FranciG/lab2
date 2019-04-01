package com.example.labs2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //adding the button
        final Button gameButton = new Button(this);

        gameButton.setText("Hello, I'm the button");
        setContentView(gameButton);


        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                gameButton.setText("You clicked "+ count +" times");
            }
        });

        }

    }


