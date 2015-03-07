package com.example.zaven.recyclerview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends ActionBarActivity {

    @SuppressWarnings("unused")
    private static final String TAG = MainActivity.class.getSimpleName();
    private Adapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        adapter = new Adapter();
        recyclerView.setAdapter(adapter);
    }
}

