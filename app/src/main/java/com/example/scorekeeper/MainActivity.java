package com.example.scorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamAIncreaseOne(View v) {
        scoreA++;
        displayForTeamA(scoreA);
    }

    public void teamBIncreaseOne(View v) {
        scoreB++;
        displayForTeamB(scoreB);
    }

    public void teamADecreaseOne(View v) {
        if (scoreA > 0) {
            scoreA--;
            displayForTeamA(scoreA);
        }
    }

    public void teamBDecreseOne(View v) {
        if (scoreB > 0) {
            scoreB--;
            displayForTeamB(scoreB);
        }

    }

    public void displayForTeamA(int score) {
        TextView scoreViewA = findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }

    public void resultBtn(View v) {
        TextView result = findViewById(R.id.ViewWinnerTeam);
        if (scoreA > scoreB) {
            result.setText("Team A");
        } else if (scoreB > scoreA) {
            result.setText("Team B");
        } else {
            result.setText("Both Teams are equal");

        }
    }

    public void resetBtn(View v) {
        TextView result = findViewById(R.id.ViewWinnerTeam);

        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        result.setText(" ");
    }
}
