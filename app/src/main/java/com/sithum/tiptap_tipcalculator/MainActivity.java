package com.sithum.tiptap_tipcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.sithum.tiptap_tipcalculator.R;
import com.sithum.tiptap_tipcalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        calculator();


        binding.btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amountString = binding.amount.getText().toString();
                double amount = Double.parseDouble(amountString);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("amount", amount);
                startActivity(intent);
            }
        });

    }

    public void calculator(){
        binding.btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText(binding.amount.getText()+"0");
            }
        });
        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText(binding.amount.getText()+"1");
            }
        });
        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText(binding.amount.getText()+"2");
            }
        });
        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText(binding.amount.getText()+"3");
            }
        });
        binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText(binding.amount.getText()+"4");
            }
        });
        binding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText(binding.amount.getText()+"5");
            }
        });
        binding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText(binding.amount.getText()+"6");
            }
        });
        binding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText(binding.amount.getText()+"7");
            }
        });
        binding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText(binding.amount.getText()+"8");
            }
        });
        binding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText(binding.amount.getText()+"9");
            }
        });
        binding.btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText(binding.amount.getText()+".");
            }
        });
        binding.btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.amount.setText("");
            }
        });
    }

}