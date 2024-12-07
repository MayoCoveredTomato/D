package edu.utsa.cs3443.projectdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.BufferedReader;

public class welcomScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom_screen);

        String username = getIntent().getStringExtra("userName");

        TextView displayName = findViewById(R.id.displayuser);
        TextView info = findViewById(R.id.gameinfo);

        displayName.setText("Hello, " + username);

        Button next = findViewById(R.id.toMainScreen);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainScreen = new Intent(getApplicationContext(), mainMenu.class);
                mainScreen.putExtra("userName", username);
                startActivity(mainScreen);
            }
        });

    }
}