package com.peytonwhite.findrepeatedwords;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button rwButton = findViewById(R.id.buttonrw);
        rwButton.setOnClickListener(this);






    }

    @Override
    public void onClick(View view) {

        EditText et = findViewById(R.id.editTextStr);
        TextView rw = findViewById(R.id.textViewRw);

        String words = et.getText().toString();
        String[] wordsToCheck = words.split(" ");
        rw.setText("");

        String temp;
        String tempNextWord;

        for(int i = 0; i < wordsToCheck.length;i++)
        {
            if(wordsToCheck[i].equals(wordsToCheck[i+1]))
            {
                rw.append(wordsToCheck[i]);
            }


        }


    }
}
