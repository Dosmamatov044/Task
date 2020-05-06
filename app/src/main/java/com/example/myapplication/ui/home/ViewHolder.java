package com.example.myapplication.ui.home;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.Task.Task;


public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textTitle);
    }

    public void onbind(Task task){
        textView.setText(task.getTitle());
    }
}
