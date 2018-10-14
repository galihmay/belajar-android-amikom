package com.galih.amikom.praktek1.activity;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.galih.amikom.praktek1.R;
import com.galih.amikom.praktek1.room.AppDatabase;
import com.galih.amikom.praktek1.room.Mahasiswa;
import com.galih.amikom.praktek1.util.RecycleAdapter;


import java.util.ArrayList;
import java.util.List;

import static com.galih.amikom.praktek1.AppApplication.db;

public class DetailActivity extends AppCompatActivity {

    RecyclerView myRecyclerview;
    RecycleAdapter recycleAdapter;
    List<Mahasiswa> listMahasiswas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Detail Activity");
        setContentView(R.layout.activity_detail);

        myRecyclerview = findViewById(R.id.myRecyclerview);
        fetchDataFromRoom();
        initRecyclerView();
        setAdapter();
    }

    private void fetchDataFromRoom() {
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"mahasiswa").allowMainThreadQueries().build();
        listMahasiswas = db.userDao().getAll();

        //just checking data from db
        for (int i = 0 ;i <listMahasiswas.size();i++){
            Log.e("Aplikasi",listMahasiswas.get(i).getAlamatLengkap()+i);
            Log.e("Aplikasi",listMahasiswas.get(i).getJurusan()+i);
            Log.e("Aplikasi",listMahasiswas.get(i).getNamaLengkap()+i);
            Log.e("Aplikasi",listMahasiswas.get(i).getNim()+i);
        }
        Log.e("cek list",""+listMahasiswas.size());
    }

    private void initRecyclerView() {
        myRecyclerview.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        myRecyclerview.setLayoutManager(llm);
        recycleAdapter =new RecycleAdapter(this,listMahasiswas);

    }

    private void setAdapter() {
        myRecyclerview.setAdapter(recycleAdapter);
    }
}
