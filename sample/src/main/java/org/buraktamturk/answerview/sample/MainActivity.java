package org.buraktamturk.answerview.sample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.buraktamturk.answerview.AnswerView;


public class MainActivity extends Activity implements AnswerView.OnAnswerChange {

    AnswerView av;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        av = (AnswerView)findViewById(R.id.av);
        av.setOnAnswerChange(this);
        av.setActiveChar('E');

        //av.setActiveChar('A');
        //av.resize(2);
    }

    @Override
    public void onAnswerChange(AnswerView view, int index) {
        Log.d("MainActivity", "Answer change " + view.getActiveChar());
    }
}
