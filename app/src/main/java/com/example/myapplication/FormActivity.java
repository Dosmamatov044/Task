package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.myapplication.Task.Task;


public class FormActivity extends AppCompatActivity {

    private EditText editTitle;
    private  EditText editDesc;














    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Bekzat");

        }

        editTitle=findViewById(R.id.edit_title);
        editDesc=findViewById(R.id.edit_desc);





    }












    public void onclick(View view) {

        String one=editTitle.toString().trim();
        String two=editDesc.toString().trim();

        Task task=new Task(one,two);

        Intent intent = new Intent();
        intent.putExtra("task",task);
        setResult(RESULT_OK,intent);
        finish();


    }



}
