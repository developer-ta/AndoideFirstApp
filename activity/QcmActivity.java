package fr.doranco.qcmapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;
import java.util.Queue;

import fr.doranco.qcmapp.R;
import fr.doranco.qcmapp.metier.DataQuiz;
import fr.doranco.qcmapp.model.Question;
import fr.doranco.qcmapp.repo.IQuestionBank;
import fr.doranco.qcmapp.repo.ImpQuestion;
import fr.doranco.qcmapp.repo.ImpQuestionBank;

public class QcmActivity extends AppCompatActivity implements View.OnClickListener {

    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qcm);
        TextView mtextView;
        Button mbutton1;
        Button mbutton2;
        Button mbutton3;
        Button mbutton4;

        mtextView = findViewById(R.id.textView);
        mbutton1 = findViewById(R.id.button);
        mbutton2 = findViewById(R.id.button2);
        mbutton3 = findViewById(R.id.button3);
        mbutton4 = findViewById(R.id.button4);

        mbutton1.setTag(1);
        mbutton2.setTag(2);
        mbutton3.setTag(3);
        mbutton4.setTag(4);
        mtextView.setText("");
        IQuestionBank quest = DataQuiz.QuestionBank;
         i = 0;
        if ( i>=0 && i < quest.questionsList().size()) {

            Question question = quest.questionsList().get(i);
            mtextView.setText((question.getQuestion()));
            List<String> resList= question.getResponsesList();

            mbutton1.setText(resList.get(0));
            mbutton2.setText(resList.get(1));
            mbutton3.setText(resList.get(2));
            mbutton4.setText(resList.get(3));
        }
    }

    @Override
    public void onClick(View v) {
int tag= (int) v.getTag();
i++;

new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {

    }
}, 2000);




    }
}
//   String str = question.getQuestion();


