package com.example.android.newsfeed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LiveStream<button> extends AppCompatActivity {

    Button hum,jeo,express,ary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_stream);

        hum= (Button) findViewById(R.id.Hum);
        ary= (Button) findViewById(R.id.Ary);
        express= (Button) findViewById(R.id.Express);
        jeo= (Button) findViewById(R.id.Jeo);

        hum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                humMethod();
            }
        });
        ary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aryMethod();
            }
        });
        express.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressMethod();
            }
        });
        jeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jeoMethod();
            }
        });
        

    }

    private void expressMethod() {
        Intent intent=new Intent(LiveStream.this,MyWebView.class);
        intent.putExtra("links","https://www.mjunoon.tv/express-news-live");
        startActivity(intent);
    }

    private void jeoMethod() {
        Intent intent=new Intent(LiveStream.this,MyWebView.class);
        intent.putExtra("links","https://live.geo.tv/");
        startActivity(intent);
    }

    private void aryMethod() {
        Intent intent=new Intent(LiveStream.this,MyWebView.class);
        intent.putExtra("links","https://live.arynews.tv/");
        startActivity(intent);
    }

    private void humMethod() {
        Intent intent=new Intent(LiveStream.this,MyWebView.class);
        intent.putExtra("links","https://www.mjunoon.tv/hum-tv-live");
        startActivity(intent);
    }
}