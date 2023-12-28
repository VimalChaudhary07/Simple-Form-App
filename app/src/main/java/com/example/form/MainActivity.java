package com.example.form;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare the views
    EditText editTextName, editTextEmail, editTextPhone, editTextAddress;
    RadioGroup radioGroupGender;
    CheckBox checkBoxCourses1, checkBoxCourses2, checkBoxCourses3;
    Button buttonSubmit;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the views
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextAddress = findViewById(R.id.editTextAddress);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        checkBoxCourses1 = findViewById(R.id.checkBoxCourses1);
        checkBoxCourses2 = findViewById(R.id.checkBoxCourses2);
        checkBoxCourses3 = findViewById(R.id.checkBoxCourses3);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewResult = findViewById(R.id.textViewResult);

        // Set a click listener for the Submit button
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the values from the form fields
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String phone = editTextPhone.getText().toString();
                String address = editTextAddress.getText().toString();
                String gender = ((RadioButton) findViewById(radioGroupGender.getCheckedRadioButtonId())).getText().toString();
                StringBuilder courses = new StringBuilder();
                if (checkBoxCourses1.isChecked()) {
                    courses.append("Java ");
                }
                if (checkBoxCourses2.isChecked()) {
                    courses.append("Android Development ");
                }
                if (checkBoxCourses3.isChecked()) {
                    courses.append("Python ");
                }

                // Display the result
                String result = "Name: " + name + "\n"
                        + "Email: " + email + "\n"
                        + "Phone: " + phone + "\n"
                        + "Address: " + address + "\n"
                        + "Gender: " + gender + "\n"
                        + "Courses Taken: " + courses.toString();
                textViewResult.setText(result);
            }
        });
    }
}
