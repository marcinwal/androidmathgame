package eu.ratingpedia.mathgame;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //init variables
        int partA = 9;
        int partB = 9;
        int correctAnswer = partA * partB;
        int wrongAnswer1 = correctAnswer - 1;
        int wrongAnswer2 = correctAnswer - 2;

        //linking to layout objects
        TextView textObjectPartA = (TextView)findViewById(R.id.textPartA);
        TextView textObjectPartB = (TextView)findViewById(R.id.textPartB);

        Button buttonObjectChoice1 = (Button)findViewById(R.id.buttonChoice1);
        Button buttonObjectChoice2 = (Button)findViewById(R.id.buttonChoice2);
        Button buttonObjectChoice3 = (Button)findViewById(R.id.buttonChoice3);

        //setting the text fields by setText
        textObjectPartA.setText(""+partA);
        textObjectPartA.setText(""+partB);

        buttonObjectChoice1.setText(""+correctAnswer);
        buttonObjectChoice2.setText(""+wrongAnswer1);
        buttonObjectChoice3.setText(""+wrongAnswer2);


    }


}
