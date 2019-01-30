package com.wiktor.demolistviewadapter.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.wiktor.demolistviewadapter.POJO.Model;
import com.wiktor.demolistviewadapter.R;
import com.wiktor.demolistviewadapter.adapter.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        // для наглядности
       // List <String> items = initData();

        // ArrayAdapter<String> adapter = new ArrayAdapter <String>(this, android.R.layout.simple_list_item_1, items);
        Adapter myAdapter = new Adapter(this, initData());

        listView.setAdapter(myAdapter);
    }

    private List <Model> initData() {
        List <Model> list = new ArrayList <Model>();
        list.add(new Model(1, "11", 111));
        list.add(new Model(2, "22", 222));
        list.add(new Model(3, "33", 333));
        list.add(new Model(4, "44", 444));
        list.add(new Model(5, "55", 555));
        list.add(new Model(6, "66", 666));
        list.add(new Model(7, "77", 777));
        list.add(new Model(8, "88", 888));
        list.add(new Model(9, "99", 999));


        return list;
    }
}
