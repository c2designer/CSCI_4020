package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class WelcomeActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        TextView textView = findViewById(R.id.welcome_textView);
        textView.setTextSize(30);
        textView.setText("\n\n\n\nWelcome To Tic-Tac-Toe Variations! \n");


        Button a = findViewById(R.id.play_button);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame();
            }
        });


    }

    private void playGame() {
        Intent intent = new Intent(getApplicationContext(),
                MainActivity.class);
        startActivity(intent);
    }


}
