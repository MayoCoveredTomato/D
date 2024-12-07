package edu.utsa.cs3443.projectdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class verses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verses);

        String username = getIntent().getStringExtra("userName");

        TextView player = findViewById(R.id.Player);
        player.setText(username);


        TextView AI = findViewById(R.id.AI);
        AI.setText("JJTheJuC");

        ImageView back = findViewById(R.id.backBTN);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previous = new Intent(getApplicationContext(), mainMenu.class);
                startActivity(previous);
            }
        });
    }
}