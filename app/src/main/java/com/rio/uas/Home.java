package com.rio.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends AppCompatActivity {

    EditText etblackcoffe,etchocolate,etcake,etcoffeelate;
    Button btnsubmit;

    Integer black,chocolate,cake,coffeelate;
    String a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //untuk pengenalan terhadap id yang ada di layout
    etblackcoffe=findViewById(R.id.etblackcoffee);
    etchocolate=findViewById(R.id.etcake);
    etcake=findViewById(R.id.etcoffeelate);
    etcoffeelate=findViewById(R.id.ethotchocolate);
    btnsubmit=findViewById(R.id.btnsubmit);


    btnsubmit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            //Data dari edittext di letakan kedalam string, lalu di ubah menjadi Integer
            /////////
            a = etblackcoffe.getText().toString();
            black = new Integer(a).intValue();
            ////////
            b = etchocolate.getText().toString();
            chocolate = new Integer(b).intValue();
            /////////
            c = etcake.getText().toString();
            cake = new Integer(c).intValue();
            //////////
            d = etcoffeelate.getText().toString();
            coffeelate = new Integer(d).intValue();
            //////////

            //Intent, untuk berpindah dari Home ke Pesanan
            Intent intent = new Intent(Home.this, PesananAct.class);
            //Untuk berpindah dengan data
            intent.putExtra("blackcoffee",black);
            intent.putExtra("chocolate",chocolate);
            intent.putExtra("cake",cake);
            intent.putExtra("coffeelate",coffeelate);

            //untuk menjalankan intent
            startActivity(intent);
        }
    });
    }
}
