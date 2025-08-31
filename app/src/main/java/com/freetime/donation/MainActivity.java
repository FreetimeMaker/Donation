package com.freetime.donation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDonateOxa = findViewById(R.id.btnDonateOxa);
        btnDonateOxa.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OxaPayActivity.class);
            startActivity(intent);
        });

        Button btnDonateCoin = findViewById(R.id.btnDonateCoin);
        btnDonateCoin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CoinbaseActivity.class);
            startActivity(intent);
        });

        Button btnDonateBTC = findViewById(R.id.btnDonateBTC);
        btnDonateBTC.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BitcoinActivity.class);
            startActivity(intent);
        });

        Button btnDonateETH = findViewById(R.id.btnDonateETH);
        btnDonateETH.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, EthereumActivity.class);
            startActivity(intent);
        });

        Button btnDonateUSDT = findViewById(R.id.btnDonateUSDT);
        btnDonateUSDT.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, USDT_Activity.class);
            startActivity(intent);
        });

        Button btnDonateUSDC = findViewById(R.id.btnDonateUSDC);
        btnDonateUSDC.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, USDC_Activity.class);
            startActivity(intent);
        });
    }
}