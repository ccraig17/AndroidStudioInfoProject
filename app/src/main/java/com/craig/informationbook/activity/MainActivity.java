package com.craig.informationbook.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.craig.informationbook.adaptor.AdaptorClass;
import com.craig.informationbook.ModelClass;
import com.craig.informationbook.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arrayList;
    private AdaptorClass adaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this)); //displays items in a vertical manner
        recyclerView.setLayoutManager(new GridLayoutManager(this,2)); //displays items in a grid manner defined by # of columns (spanCount)
        arrayList = new ArrayList<>();
        ModelClass modelClass1 = new ModelClass("countries", "The Countries");
        ModelClass modelClass2 = new ModelClass("leaders", "The Leaders");
        ModelClass modelClass3 = new ModelClass("museums", "The Museums");
        ModelClass modelClass4 = new ModelClass("wonders", "Seven Wonders Of The World");
        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);

        adaptor = new AdaptorClass(arrayList, this);
        recyclerView.setAdapter(adaptor);

    }


}