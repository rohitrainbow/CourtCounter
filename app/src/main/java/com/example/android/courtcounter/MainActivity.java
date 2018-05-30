package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreForTeamA=0;
    int scoreForTeamB=0;
    final int POINTS_FOR_3POINTER=3;
    final int POINTS_FOR_2POINTER=2;
    final int POINTS_FOR_FREETHROW=1;

    public void displayForTeamA(int scoreForTeamA)
    {
        TextView teamAScoreView = (TextView) findViewById(R.id.scoreTeamA);
        teamAScoreView.setText(String.valueOf(scoreForTeamA));
    }

    public void updateScoreTeamA(View view)
    {
        String buttonText=((Button)view).getText().toString();
        if(buttonText.equalsIgnoreCase("+3 Points"))
            scoreForTeamA=scoreForTeamA+POINTS_FOR_3POINTER;
        else if(buttonText.equalsIgnoreCase("+2 Points"))
            scoreForTeamA=scoreForTeamA+POINTS_FOR_2POINTER;
        else
            scoreForTeamA=scoreForTeamA+POINTS_FOR_FREETHROW;
        displayForTeamA(scoreForTeamA);
    }

    public void displayForTeamB(int scoreForTeamB)
    {
        TextView teamAScoreView = (TextView) findViewById(R.id.scoreTeamB);
        teamAScoreView.setText(String.valueOf(scoreForTeamB));
    }

    public void updateScoreTeamB(View view)
    {
        String buttonText=((Button)view).getText().toString();
        if(buttonText.equalsIgnoreCase("+3 Points"))
            scoreForTeamB=scoreForTeamB+POINTS_FOR_3POINTER;
        else if(buttonText.equalsIgnoreCase("+2 Points"))
            scoreForTeamB=scoreForTeamB+POINTS_FOR_2POINTER;
        else
            scoreForTeamB=scoreForTeamB+POINTS_FOR_FREETHROW;
        displayForTeamB(scoreForTeamB);
    }

    public void resetScore(View view)
    {
        scoreForTeamA=0;
        scoreForTeamB=0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }
}
