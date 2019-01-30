package com.wiktor.demolistviewadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        List<String> items = initData();

        ArrayAdapter<String> adapter = new ArrayAdapter <String>(this, R.layout.item, items);

listView.setAdapter(adapter);
    }

    private List<String> initData (){
List<String> list = new ArrayList <String>();
list.add("1");
list.add("2");
list.add("3");
list.add("4");
list.add("5");
list.add("6");
list.add("7");
list.add("8");
list.add("9");
list.add("10");


        return list;
    }
}
