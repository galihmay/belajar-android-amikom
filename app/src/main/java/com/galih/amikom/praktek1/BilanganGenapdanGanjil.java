package com.galih.amikom.praktek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BilanganGenapdanGanjil extends AppCompatActivity {
    TextView im ;
    TextView pros ;
    Button pro ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Bilangan Genap dan Ganjil");
        setContentView(R.layout.activity_bilangan_genap_dan_ganjil);
        pro = (Button)findViewById(R.id.button1);
        im =(TextView)findViewById(R.id.editText1);
        pros =(TextView)findViewById(R.id.editText2);

        pro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                int n1 = Integer.parseInt(im.getText().toString()) ;
                for (int i = 0; i <=n1; i++) {

                    if(i % 2==0){
                        pros.setText("genap ");
                    }else{
                        pros.setText("ganjil");
                    }
                }
                im.setText(null);
            }


        });

    }
}