package com.galih.amikom.praktek1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.galih.amikom.praktek1.R.id.editText2;


public class BilanganGenapdanGanjil extends AppCompatActivity {
    private Button btnPros;
    int n;
    private EditText input, output;
    private ListView LV;
    private List<String> listData = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Bilangan Genap dan Ganjil");
        setContentView(R.layout.activity_bilangan_genap_dan_ganjil);
        findID();
        initListener();
        initListView();
    }

    private void findID() {
        btnPros = (Button) findViewById(R.id.button_Ok);
        input = (EditText) findViewById(R.id.eT_input);
        output = (EditText) findViewById(editText2);
    }

    private void initListener() {
        btnPros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = Integer.parseInt(input.getText().toString());
                for (int i = 0; i <= n; i++) {
                    if (i % 2 == 0) {
                        listData.add(i + ": Bilangan Genap");
                        output.setText(n + " Bilangan Genap");
                    } else {
                        listData.add(i + ": Bilangan  Ganjil");
                        output.setText(n + " Bilangan  Ganjil");
                    }
                }
            }
        });
    }

    private void initListView() {
        LV = (ListView) findViewById(R.id.mLv);
        final ArrayAdapter<String> LvAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listData);
        LV.setAdapter(LvAdapter);
    }
}
