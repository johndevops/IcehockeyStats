package at.webstube.icehockeystats;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Reacts on Button click
     */
    public void buttonClick(View view) {
        switch (view.getId()) {
            case R.id.buttonPlus3PointsTeamA:
                increaseScoreForTeam("A", 3);
                break;
            case R.id.buttonPlus2PointsTeamA:
                increaseScoreForTeam("A", 2);
                break;
            case R.id.buttonFreeThrowTeamA:
                increaseScoreForTeam("A", 1);
                break;
            case R.id.buttonPlus3PointsTeamB:
                increaseScoreForTeam("B", 3);
                break;
            case R.id.buttonPlus2PointsTeamB:
                increaseScoreForTeam("B", 2);
                break;
            case R.id.buttonFreeThrowTeamB:
                increaseScoreForTeam("B", 1);
                break;
            case R.id.buttonReset:
                resetScore();
                break;
        }
    }

    /**
     * Reset the score of both teams
     */
    private void resetScore() {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * Increase score for Team A by passed value
     */
    private void increaseScoreForTeam(String team, int score) {
        if (team == "A") {
            scoreTeamA += score;
            displayScoreTeamA(scoreTeamA);
        } else {
            scoreTeamB += score;
            displayScoreTeamB(scoreTeamB);
        }
    }


    /**
     * Displays the given score for Team A
     */
    private void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreOfTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B
     */
    private void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreOfTeamB);
        scoreView.setText(String.valueOf(score));
    }

}
