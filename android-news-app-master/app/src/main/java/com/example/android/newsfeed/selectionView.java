package com.example.android.newsfeed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class selectionView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_view);
    }

    public void EnterApp(View view) {
        Intent intent=new Intent(selectionView.this,MainActivity.class);
        startActivity(intent);
    }

    public void liveStream(View view) {
        Intent intent=new Intent(selectionView.this,LiveStream.class);
        startActivity(intent);
    }
}