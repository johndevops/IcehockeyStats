package at.webstube.icehockeystats;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int goalsHome = 0;
    private int goalsGuest = 0;
    private int faceOffsHome = 0;
    private int faceOffsGuest = 0;
    private int penaltiesHome = 0;
    private int penaltiesGuest = 0;
    private int offsidesHome = 0;
    private int offsidesGuest = 0;
    private int shotsHome = 0;
    private int shotsGuest = 0;
    private int shotsOnGoalHome = 0;
    private int shotsOnGoalGuest = 0;

    private final int increaseNumOne = 1;
    private final int increasePenaltySmall = 2;

    private final String teamHome = "home";
    private final String teamGuest = "guest";
    private final String attributeNameGoal = "goal";
    private final String attributeNameFaceOff = "faceoff";
    private final String attributeNamePenalty = "penalty";
    private final String attributeNameOffSide = "offside";
    private final String attributeNameShot = "shot";
    private final String attributeNameShotOnGoal = "shotongoal";

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
            case R.id.button_reset:
                resetValues();
                resetTextViews();
                break;
        }
    }

    /**
     * Reset the values of both teams
     */
    private void resetValues() {
        goalsHome = 0;
        goalsGuest = 0;
        faceOffsHome = 0;
        faceOffsGuest = 0;
        penaltiesHome = 0;
        penaltiesGuest = 0;
        offsidesHome = 0;
        offsidesGuest = 0;
        shotsHome = 0;
        shotsGuest = 0;
        shotsOnGoalHome = 0;
        shotsOnGoalGuest = 0;
    }

    /**
     * Reset the views of both teams
     */
    private void resetTextViews() {
        TextView view;
        view = (TextView) findViewById(R.id.text_goal_home);
        view.setText(String.valueOf(goalsHome));
        view = (TextView) findViewById(R.id.text_faceOff_home);
        view.setText(String.valueOf(faceOffsHome));
        view = (TextView) findViewById(R.id.text_penalty_home);
        view.setText(String.valueOf(penaltiesHome));
        view = (TextView) findViewById(R.id.text_offside_home);
        view.setText(String.valueOf(offsidesHome));
        view = (TextView) findViewById(R.id.text_shot_home);
        view.setText(String.valueOf(shotsHome));
        view = (TextView) findViewById(R.id.text_shotOnGoal_home);
        view.setText(String.valueOf(shotsOnGoalHome));
        view = (TextView) findViewById(R.id.text_goal_guest);
        view.setText(String.valueOf(goalsGuest));
        view = (TextView) findViewById(R.id.text_faceOff_guest);
        view.setText(String.valueOf(faceOffsGuest));
        view = (TextView) findViewById(R.id.text_penalty_guest);
        view.setText(String.valueOf(penaltiesGuest));
        view = (TextView) findViewById(R.id.text_offside_guest);
        view.setText(String.valueOf(offsidesGuest));
        view = (TextView) findViewById(R.id.text_shot_guest);
        view.setText(String.valueOf(shotsGuest));
        view = (TextView) findViewById(R.id.text_shotOnGoal_guest);
        view.setText(String.valueOf(shotsOnGoalGuest));
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
