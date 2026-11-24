package com.example.firstapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
@SuppressLint("UseSwitchCompatOrMaterialCode")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.bt1);
        RadioGroup rg = findViewById(R.id.rg1);
        CheckBox cb = findViewById(R.id.cb1);
        Switch sw = findViewById(R.id.sw1);
        ToggleButton tb = findViewById(R.id.tb1);
        rg.check(rg.getChildAt(0).getId());
        //fyryryrf7y6
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Вы нажали кнопку", Toast.LENGTH_SHORT).show();
            }
        });
        cb.setOnCheckedChangeListener((localButton, checked) -> {
            if (checked)
                Toast.makeText(MainActivity.this, "CheckBox активен", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(MainActivity.this, "CheckBox НЕактивен", Toast.LENGTH_SHORT).show();
        });
        rg.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selected = findViewById(checkedId);
            Toast.makeText(MainActivity.this, selected.getText(), Toast.LENGTH_SHORT).show();
        });
        sw.setOnCheckedChangeListener((localButton, checked) ->{
            if (checked)
                Toast.makeText(MainActivity.this, "Switch активен", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(MainActivity.this, "Switch НЕактивен", Toast.LENGTH_SHORT).show();
        });
        tb.setOnCheckedChangeListener((localButton, checked) ->{
            ToggleButton localToggleButton = (ToggleButton) localButton;
            String output = "";
            output += "Предыдущее значение: " + (checked ? localToggleButton.getTextOff() : localToggleButton.getTextOn());
            output += "\n";
            output += "Новое значение: " + (checked ? localToggleButton.getTextOn() : localToggleButton.getTextOff());
            Toast.makeText(MainActivity.this, output, Toast.LENGTH_SHORT).show();
        });

    }
}