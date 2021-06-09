package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<Friends> friendsList = new ArrayList<Friends>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAdapterList();
    }

    private void setAdapterList() {
        Friends f0= new Friends("Prophet)");
        Friends f1= new Friends("Messenger");
        Friends f2= new Friends("servant of God (abd)");
        Friends f3= new Friends("The gatherer (hashir)");
        Friends f4= new Friends("Talha (R.A");
        Friends f5= new Friends("witness (shahid)");
        Friends f6= new Friends("bearer of good tidings (mubashshir)");
        Friends f7= new Friends(" warner (nathir)");
        Friends f8= new Friends("reminder (mudhakkir)");
        Friends f9= new Friends("light personified (noor)");
        Friends f10= new Friends("one who calls [unto God] (dā'ī)");
        friendsList.addAll(Arrays.asList(new Friends[]{f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10}));

        recyclerView= findViewById(R.id.friendsList);
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(friendsList,MainActivity.this) {};
        recyclerView.setAdapter(adapter);
    }
}