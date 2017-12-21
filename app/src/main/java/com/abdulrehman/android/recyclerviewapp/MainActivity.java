package com.abdulrehman.android.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList = (RecyclerView) findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String [] languages = {"Java", "Javascript", "PHP", "Java", "Javascript", "PHP", "Java", "Javascript", "PHP", "Java", "Javascript", "PHP", "Java", "Javascript", "PHP", "Java", "Javascript", "PHP"};
        programmingList.setAdapter(new ProgrammingAdapter(languages));

    }
}
