package com.example.siddh.highlow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.util.logging.Logger.global;

public class MainActivity extends AppCompatActivity {

    int random;

    public void guess(View view) {

        EditText guessText = (EditText) findViewById(R.id.guessText);
        int guessInt = Integer.parseInt(guessText.getText().toString());
        if(guessInt < random) {
            Toast.makeText(MainActivity.this, "Go Higher!", Toast.LENGTH_SHORT).show();
        }else if(guessInt > random){
            Toast.makeText(MainActivity.this, "Go Lower!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this, "That's Right! Try Again :)", Toast.LENGTH_SHORT).show();

            Random rand = new Random();
            random = rand.nextInt(10) + 1;

        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        random = rand.nextInt(10) + 1;

    }
}
