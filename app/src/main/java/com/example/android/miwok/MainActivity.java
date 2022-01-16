package com.example.android.miwok;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        NumbersClickListener clickListener = new NumbersClickListener();
//        numbers.setOnClickListener(clickListener);
        TextView numbers = (TextView)findViewById(R.id.numbers);
        TextView family = (TextView) findViewById(R.id.family);
        TextView colors = (TextView) findViewById(R.id.colors);
        TextView phrases = (TextView) findViewById(R.id.phrases);
            numbers.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(numbersIntent);
                }
            });
            phrases.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(phrasesIntent);
                }
            });
            colors.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(colorsIntent);
                }
            });
            family.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(familyIntent);
                }
            });


    }
//    public void NumbersActivity(View view){
//        Intent i = new Intent(this,NumbersActivity.class);
//        startActivity(i);
//    }
//    public void ColorsActivity(View view){
//        Intent i = new Intent(this,ColorsActivity.class);
//        startActivity(i);
//    }
//    public void FamilyActivity(View view){
//        Intent i = new Intent(this,FamilyActivity.class);
//        startActivity(i);
//    }
//    public void PhrasesActivity(View view){
//        Intent i = new Intent(this,PhrasesActivity.class);
//        startActivity(i);
//    }
}



