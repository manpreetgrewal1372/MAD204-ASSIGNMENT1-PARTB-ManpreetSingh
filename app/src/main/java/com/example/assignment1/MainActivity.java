package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Course: MAD204-01
 * Assignment: Part B – Android Studio Application
 * Student: Manpreet Singh
 * Student ID: A00198842
 * Date: 2025-10-06
 * Description: This app takes user name, age, and program,
 * validates the input, and displays an introduction message.
 */
public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge, editTextProgram;
    private Button buttonIntroduce;
    private TextView textViewOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        editTextProgram = findViewById(R.id.editTextProgram);
        buttonIntroduce = findViewById(R.id.buttonIntroduce);
        textViewOutput = findViewById(R.id.textViewOutput);

        buttonIntroduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleIntroduce();
            }
        });
    }

    private void handleIntroduce() {
        String name = editTextName.getText().toString().trim();
        String ageStr = editTextAge.getText().toString().trim();
        String program = editTextProgram.getText().toString().trim();

        if (name.isEmpty() || ageStr.isEmpty() || program.isEmpty()) {
            Toast.makeText(this, "All fields are required!", Toast.LENGTH_SHORT).show();
            return;
        }

        int age;
        try {
            age = Integer.parseInt(ageStr);
            if (age <= 0) {
                Toast.makeText(this, "Age must be greater than 0.", Toast.LENGTH_SHORT).show();
                return;
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid age format.", Toast.LENGTH_SHORT).show();
            return;
        }

        String introMessage = generateIntroduction(name, age, program);
        textViewOutput.setText(introMessage);
    }

    private String generateIntroduction(String name, int age, String program) {
        return "👋 Hello, I'm " + name + ".\n" +
                "🎓 Age: " + age + "\n" +
                "📚 Program: " + program + "\n" +
                "✅ Ready to learn and grow!";
    }
}
