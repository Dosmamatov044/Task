package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.Task.Task;


public class FormActivity extends AppCompatActivity {


    private EditText editTitle;
    private EditText editDesc;
    private EditText bekzat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Bekzat");

        }

        editTitle = findViewById(R.id.edit_title);
        editDesc = findViewById(R.id.edit_desc);
        bekzat = findViewById(R.id.Bekzat);


    }


    public void onclick(View view) {

        String one = editDesc.toString().trim();
        String two = editTitle.toString().trim();
        String three = bekzat.toString().trim();

        Task task = new Task();
        task.setDesc(one);
        task.setTitle(two);
        task.setBekzat(three);
        Intent intent = new Intent();
        intent.putExtra("task", task);
        setResult(RESULT_OK, intent);


        finish();


    }
}