package com.example.learnaccess;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChatbotActivity extends AppCompatActivity {
    private EditText chatInput;
    private TextView chatbotResponse;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        chatInput = findViewById(R.id.chatInput);
        chatbotResponse = findViewById(R.id.chatbotResponse);
        sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mock chatbot response
                String userMessage = chatInput.getText().toString();
                chatbotResponse.setText("AI: I'm here to help you with " + userMessage);
            }
        });
    }
}
