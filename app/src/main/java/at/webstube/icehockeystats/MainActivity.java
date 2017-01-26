package at.webstube.icehockeystats;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int goalsHome = 0;
    int goalsGuest = 0;
    int faceOffsHome = 0;
    int faceOffsGuest = 0;
    int penaltiesHome = 0;
    int penaltiesGuest = 0;
    int offsidesHome = 0;
    int offsidesGuest = 0;
    int shotsHome = 0;
    int shotsGuest = 0;
    int shotsOnGoalHome = 0;
    int shotsOnGoalGuest = 0;
    int increaseNumOne = 1;
    int increasePenaltySmall = 2;
    final String teamHome = "home";
    final String teamGuest = "guest";
    final String attributeNameGoal = "goal";
    final String attributeNameFaceOff = "faceoff";
    final String attributeNamePenalty = "penalty";
    final String attributeNameOffSide = "offside";
    final String attributeNameShot = "shot";
    final String attributeNameShotOnGoal = "shotongoal";

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
            case R.id.button_goal_home:
                increase(teamHome, attributeNameGoal, increaseNumOne);
                break;
            case R.id.button_faceOff_home:
                increase(teamHome, attributeNameFaceOff, increaseNumOne);
                break;
            case R.id.button_penalty_home:
                increase(teamHome, attributeNamePenalty, increasePenaltySmall);
                break;
            case R.id.button_offside_home:
                increase(teamHome, attributeNameOffSide, increaseNumOne);
                break;
            case R.id.button_shot_home:
                increase(teamHome, attributeNameShot, increaseNumOne);
                break;
            case R.id.button_shotOnGoal_home:
                increase(teamHome, attributeNameShotOnGoal, increaseNumOne);
                break;
            case R.id.button_goal_guest:
                increase(teamGuest, attributeNameGoal, increaseNumOne);
                break;
            case R.id.button_faceOff_guest:
                increase(teamGuest, attributeNameFaceOff, increaseNumOne);
                break;
            case R.id.button_penalty_guest:
                increase(teamGuest, attributeNamePenalty, increasePenaltySmall);
                break;
            case R.id.button_offside_guest:
                increase(teamGuest, attributeNameOffSide, increaseNumOne);
                break;
            case R.id.button_shot_guest:
                increase(teamGuest, attributeNameShot, increaseNumOne);
                break;
            case R.id.button_shotOnGoal_guest:
                increase(teamGuest, attributeNameShotOnGoal, increaseNumOne);
                break;
        }
    }

    /**
     * Reset the score of both teams
     */
    private void resetScore() {

    }

    /**
     * Increase team stats by passed attribute and value
     */
    private void increase(String team, String attr, int increaseNum) {
        //TextView view = new TextView(this);
        TextView view;
        if (team.equals(teamHome)) {
            switch (attr) {
                case attributeNameGoal:
                    goalsHome += increaseNum;
                    view = (TextView) findViewById(R.id.text_goal_home);
                    view.setText(String.valueOf(goalsHome));
                    break;
                case attributeNameFaceOff:
                    faceOffsHome += increaseNum;
                    view = (TextView) findViewById(R.id.text_faceOff_home);
                    view.setText(String.valueOf(faceOffsHome));
                    break;
                case attributeNamePenalty:
                    penaltiesHome += increaseNum;
                    view = (TextView) findViewById(R.id.text_penalty_home);
                    view.setText(String.valueOf(penaltiesHome));
                    break;
                case attributeNameOffSide:
                    offsidesHome += increaseNum;
                    view = (TextView) findViewById(R.id.text_offside_home);
                    view.setText(String.valueOf(offsidesHome));
                    break;
                case attributeNameShot:
                    shotsHome += increaseNum;
                    view = (TextView) findViewById(R.id.text_shot_home);
                    view.setText(String.valueOf(shotsHome));
                    break;
                case attributeNameShotOnGoal:
                    shotsOnGoalHome += increaseNum;
                    view = (TextView) findViewById(R.id.text_shotOnGoal_home);
                    view.setText(String.valueOf(shotsOnGoalHome));
                    break;
            }
        } else if (team.equals(teamGuest)) {
            switch (attr) {
                case attributeNameGoal:
                    goalsGuest += increaseNum;
                    view = (TextView) findViewById(R.id.text_goal_guest);
                    view.setText(String.valueOf(goalsGuest));
                    break;
                case attributeNameFaceOff:
                    faceOffsGuest += increaseNum;
                    view = (TextView) findViewById(R.id.text_faceOff_guest);
                    view.setText(String.valueOf(faceOffsGuest));
                    break;
                case attributeNamePenalty:
                    penaltiesGuest += increaseNum;
                    view = (TextView) findViewById(R.id.text_penalty_guest);
                    view.setText(String.valueOf(penaltiesGuest));
                    break;
                case attributeNameOffSide:
                    offsidesGuest += increaseNum;
                    view = (TextView) findViewById(R.id.text_offside_guest);
                    view.setText(String.valueOf(offsidesGuest));
                    break;
                case attributeNameShot:
                    shotsGuest += increaseNum;
                    view = (TextView) findViewById(R.id.text_shot_guest);
                    view.setText(String.valueOf(shotsGuest));
                    break;
                case attributeNameShotOnGoal:
                    shotsOnGoalGuest += increaseNum;
                    view = (TextView) findViewById(R.id.text_shotOnGoal_guest);
                    view.setText(String.valueOf(shotsOnGoalGuest));
                    break;
            }
        }
    }
}
