package com.example.jigar.customerlist;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ArrayList<Customer> data;
    private CustomerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData ();

    }
    public void loadData()
    {
        recyclerView = (RecyclerView)findViewById(R.id.rvList);
        // use this to improve performance that changes in content do not affect the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        // Specify an Adapter
        data = new ArrayList<>(Arrays.asList(ApiCaller.getCustomers()));
        adapter = new CustomerAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
