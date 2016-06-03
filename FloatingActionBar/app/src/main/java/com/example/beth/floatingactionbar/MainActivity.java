package com.example.beth.floatingactionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.melnykov.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ListView listView = (ListView) findViewById(android.R.id.list);
    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.attachToListView(listView);
}
