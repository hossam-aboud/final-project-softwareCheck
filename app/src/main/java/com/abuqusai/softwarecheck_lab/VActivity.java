package com.abuqusai.softwarecheck_lab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.abuqusai.softwarecheck_lab.adapters.Adapter;

import java.util.ArrayList;

public class VActivity extends AppCompatActivity {
    RecyclerView rv_recycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vactivity);

        rv_recycle = findViewById(R.id.rv_recycle);

        getNames();


    }
    void getNames(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Hossam");
        names.add("naim");
        names.add("nouman");
        names.add("yousef");
        names.add("eman");
        names.add("ahmed");
        names.add("wisam");

        Adapter adapter = new Adapter(names);
        rv_recycle.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        rv_recycle.setAdapter(adapter);
    }
}