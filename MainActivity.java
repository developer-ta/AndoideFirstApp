package fr.doranco.qcmapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import fr.doranco.qcmapp.activity.QcmActivity;
import fr.doranco.qcmapp.metier.ToolsQcm;

public class MainActivity extends AppCompatActivity {
    // filed
    EditText mEditText;
    ImageButton mImageButton;
    public String mUserName;
    Button mbutton;


    //********************************* onCreate() ********************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mEditText = findViewById(R.id.editTextPersonName1);
        mImageButton = findViewById(R.id.imageButton1);
        mbutton = findViewById(R.id.button2);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.getText().clear();
            }
        });
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @SuppressLint("ResourceAsColor")
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // validation enter alphabets

                int lastIndex = s.length() - 1;

                if (s.length() > 0 && lastIndex >= 0) {

                    char lastChar = s.charAt(lastIndex);
                    String lastStr = Character.toString(lastChar);
                    if (Character.isLetter(lastChar) && !Character.isDigit(lastChar) && !s.toString().isEmpty() && !s.toString().equals("")) {
                        mImageButton.setBackgroundColor(Color.rgb(14, 48, 239));
                        mbutton.setBackgroundColor(Color.rgb(14, 48, 239));

                    } else {
                        mEditText.setHint("accepte uniquement caractère alphabétique");
                        mbutton.setBackgroundColor(Color.RED);
                        mImageButton.setBackgroundColor(Color.RED);

                        mEditText.setHintTextColor(android.R.color.holo_red_dark);
                    }
                } else {
                    ToolsQcm.alertMegNoValide(MainActivity.this, 30, 10);
                    mbutton.setBackgroundColor(Color.RED);
                    mImageButton.setBackgroundColor(Color.RED);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

// stock in preferences_Container *********************************************
        // Context context = getApplicationContext();
        //getSharedPreferences();
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUserName = mEditText.getText().toString().toUpperCase();
                SharedPreferences preferences_Container = getSharedPreferences("userProfile", 0);
                Editor editor = preferences_Container.edit();
                editor.putString("nom", mUserName).commit();

                Intent newActivity = new Intent(MainActivity.this, QcmActivity.class);
                startActivity(newActivity);
            }
        });


    }
}