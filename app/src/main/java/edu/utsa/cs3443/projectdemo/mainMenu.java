package edu.utsa.cs3443.projectdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ImageView chest = findViewById(R.id.chest);
        ImageView question = findViewById(R.id.question);
        ImageView shopping = findViewById(R.id.Shopping);
        ImageView verses = findViewById(R.id.verses);
        ImageView closet = findViewById(R.id.closest);
        TextView name = findViewById(R.id.menuName);
        String username = getIntent().getStringExtra("userName");

        name.setText(username);


        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), chest.class);
                startActivity(nextScreen);
            }
        });

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), question.class);
                startActivity(nextScreen);
            }
        });

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), Links.class);
                startActivity(nextScreen);
            }
        });

        verses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), verses.class);
                nextScreen.putExtra("userName", username);
                startActivity(nextScreen);
            }
        });

        closet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), closet.class);
                startActivity(nextScreen);
            }
        });
    }
}