package com.example.cos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText getimie;
    private EditText getnazwisko;
    private TextView getwynikTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getimie = findViewById(R.id.editImie);
        getnazwisko = findViewById(R.id.editNazwisko);
        button = findViewById(R.id.button);
        getwynikTextView = findViewById(R.id.wynikTextView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String imie = getimie.getText().toString();
                String nazwisko = getnazwisko.getText().toString();

                String mess = "Witaj użytkowniku - "+imie+" "+nazwisko;
                getwynikTextView.setText(mess);
            }
        });
    }
}