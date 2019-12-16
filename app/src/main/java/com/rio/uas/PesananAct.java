package com.rio.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class PesananAct extends AppCompatActivity {

    TextView tvbc,tvhot,tvcake,tvcoffeelate;
    Integer hargabc,hargahot,hargacake,hargacoffeelate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);

        //ambil data dari intent
        Bundle bundle = getIntent().getExtras();
        final Integer blackcoffee = bundle.getInt("blackcoffee");
        final Integer chocolate = bundle.getInt("chocolate");
        final Integer cake = bundle.getInt("cake");
        final Integer coffeelate = bundle.getInt("coffeelate");

        tvbc=findViewById(R.id.tv_blackcoffee);
        tvcake=findViewById(R.id.tv_cake);
        tvcoffeelate=findViewById(R.id.tv_coffeelate);
        tvhot=findViewById(R.id.tv_hotchocolate);

        TextView tv_total_harga = (TextView) findViewById(R.id.tv_total_harga);

        String format ="###,###.##";
        DecimalFormat dm = new DecimalFormat(format);

        hargabc=blackcoffee*15000;
        hargacoffeelate=coffeelate*15000;
        hargahot=chocolate*15000;
        hargacake=cake*15000;

        Integer total_harga = hargabc+hargacoffeelate+hargahot+hargacake;

        tvbc.setText("Rp"+dm.format(hargabc));
        tvcake.setText("Rp"+dm.format(hargacake));
        tvhot.setText("Rp"+dm.format(hargahot));
        tvcoffeelate.setText("Rp"+dm.format(hargacoffeelate));

        tv_total_harga.setText("Rp"+dm.format(total_harga));

    }
}
