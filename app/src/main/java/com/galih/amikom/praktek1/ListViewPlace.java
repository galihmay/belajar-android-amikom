package com.galih.amikom.praktek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewPlace extends AppCompatActivity {
    String[] listArray={"Data 1","Data 2","Data 3","Data 4",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("ListView");
        setContentView(R.layout.activity_list_view_place);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_list_view,listArray);
        ListView listview =(ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);
    }
}
