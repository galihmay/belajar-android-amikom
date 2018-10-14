package com.galih.amikom.praktek1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static  com.galih.amikom.praktek1.AppApplication.db;
import com.galih.amikom.praktek1.R;
import com.galih.amikom.praktek1.room.Mahasiswa;

public class AddUserActivity extends AppCompatActivity {

    private Button MasukanData;
    private EditText etAlamatLengkap;
    private EditText etJurusan;
    private EditText etNamaLengkap;
    private EditText etNIM;
    Mahasiswa mahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Add User");
        setContentView(R.layout.activity_add_user);

        MasukanData = findViewById(R.id.btMasukan);
        etAlamatLengkap = findViewById(R.id.etAlamatLengkap);
        etJurusan= findViewById(R.id.etJurusan);
        etNIM = findViewById(R.id.etNIM);
        etNamaLengkap = findViewById(R.id.etNamaLengkap);

        MasukanData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etAlamatLengkap.getText().toString().isEmpty()&&!etJurusan.getText().toString().isEmpty()&&
                        !etNamaLengkap.getText().toString().isEmpty()&&!etNIM.getText().toString().isEmpty()){

                    mahasiswa = new Mahasiswa();
                    mahasiswa.setAlamatLengkap(etAlamatLengkap.getText().toString());
                    mahasiswa.setJurusan(etJurusan.getText().toString());
                    mahasiswa.setNamaLengkap(etNamaLengkap.getText().toString());
                    mahasiswa.setNIM(etNIM.getText().toString());
                    //Insert data in database
                    db.userDao().insertAll(mahasiswa);
                    startActivity(new Intent(AddUserActivity.this,DetailActivity.class));
                }else {
                    Toast.makeText(getApplicationContext(), "Masukan data dengan benar", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
