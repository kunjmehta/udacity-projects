package com.example.kunj.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addGoalsUnited(View view) {
        TextView goalsUnited = (TextView) findViewById(R.id.goals_United_Field);
        int goals_United = Integer.parseInt(goalsUnited.getText().toString());
        goalsUnited.setText("" + ++goals_United);

        TextView score1 = (TextView) findViewById(R.id.team1_score);
        int score_one = Integer.parseInt(score1.getText().toString());
        score1.setText("" + ++score_one);
    }


