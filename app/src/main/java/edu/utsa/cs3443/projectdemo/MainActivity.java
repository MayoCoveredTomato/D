package edu.utsa.cs3443.projectdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.startsubmit);
        EditText name = findViewById(R.id.editTextStart);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = name.getText().toString();
                Intent nextScreen = new Intent(getApplicationContext(), welcomScreen.class);
                nextScreen.putExtra("userName", user);
                startActivity(nextScreen);
            }
        });



    }
}