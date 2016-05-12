package com.mac.chris.listviewviewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> notes;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        init();
        MyAdapter adapter = new MyAdapter(this, R.layout.listview_item, notes );
        listView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    public void init() {
        notes = new ArrayList<>();
        for (int i=0; i<100; i++) {
            notes.add(i, "Text at position "+i);
        }
    }
}
