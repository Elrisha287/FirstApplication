package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void send(View view){
        Toast.makeText(this,"Sending message from the app...", Toast.LENGTH_SHORT).show();
    }
    public void receive(View view){
        Toast.makeText(this,"Receiving message to the app...", Toast.LENGTH_SHORT).show();
    }
    public void delete(View view){
        Toast.makeText(this,"Deleting message from the app...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}