package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.id.text1;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    TextView mStoryTextView;
    Button mAnswerTopButton;
    Button mAnswerBottomButton;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mAnswerTopButton = (Button) findViewById(R.id.buttonTop);
        mAnswerBottomButton = (Button) findViewById(R.id.buttonBottom);


        mAnswerTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mStoryIndex) {
                    case 1:
                        mAnswerTopButton.setText(getResources().getString(R.string.T3_Ans1));
                        mAnswerBottomButton.setText(getResources().getString(R.string.T3_Ans2));
                        mStoryTextView.setText(getResources().getString(R.string.T3_Story));
                        mStoryIndex = 3;
                        break;
                    case 2:
                        mAnswerTopButton.setText(getResources().getString(R.string.T3_Ans1));
                        mAnswerBottomButton.setText(getResources().getString(R.string.T3_Ans2));
                        mStoryTextView.setText(getResources().getString(R.string.T3_Story));
                        mStoryIndex = 3;
                        break;
                    case 3:
                        mStoryTextView.setText(getResources().getString(R.string.T6_End));
                        mAnswerTopButton.setVisibility(View.INVISIBLE);
                        mAnswerBottomButton.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });

        mAnswerBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mStoryIndex) {
                    case 1:
                        mAnswerTopButton.setText(getResources().getString(R.string.T2_Ans1));
                        mAnswerBottomButton.setText(getResources().getString(R.string.T2_Ans2));
                        mStoryTextView.setText(getResources().getString(R.string.T2_Story));
                        mStoryIndex = 2;
                        break;
                    case 2:
                        mStoryTextView.setText(getResources().getString(R.string.T4_End));
                        mAnswerTopButton.setVisibility(View.INVISIBLE);
                        mAnswerBottomButton.setVisibility(View.INVISIBLE);
                        break;
                    case 3:
                        mStoryTextView.setText(getResources().getString(R.string.T5_End));
                        mAnswerTopButton.setVisibility(View.INVISIBLE);
                        mAnswerBottomButton.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });
    }
}
