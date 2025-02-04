package com.example.learnaccess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button startLearningButton, viewTutorsButton, chatbotButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startLearningButton = findViewById(R.id.startLearningButton);
        viewTutorsButton = findViewById(R.id.viewTutorsButton);
        chatbotButton = findViewById(R.id.chatbotButton);

        startLearningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Learning Activity or Roadmap
                Intent intent = new Intent(MainActivity.this, ProgressActivity.class);
                startActivity(intent);
            }
        });

        viewTutorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Tutors Activity
                Intent intent = new Intent(MainActivity.this, TutorsActivity.class);
                startActivity(intent);
            }
        });

        chatbotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Chatbot Activity
                Intent intent = new Intent(MainActivity.this, ChatbotActivity.class);
                startActivity(intent);
            }
        });
    }
}
