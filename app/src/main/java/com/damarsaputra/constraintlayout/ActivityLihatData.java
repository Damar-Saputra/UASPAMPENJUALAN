package com.damarsaputra.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaBarang);
        tvnomor = findViewById(R.id.tvNomorSize);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Compass Gazelle High":
                tvnama.setText("Compass Gazelle High-Black");
                tvnomor.setText("43");
                break;
            case "Compass Gazelle Low":
                tvnama.setText("Compass Gazelle Low-Black");
                tvnomor.setText("41");
                break;
            case "Compass Bravo High":
                tvnama.setText("Compass Bravo High");
                tvnomor.setText("39 40 42");
                break;
            case "Compass Bravo Low":
                tvnama.setText("Compass Bravo Low");
                tvnomor.setText("40 41 42 43");
                break;
            case "Compass Research & Destroy (R&D) Proto 1 High":
                tvnama.setText("Compass Research & Destroy (R&D) Proto 1 High");
                tvnomor.setText("40");
                break;
            case "Compass Research & Destroy (R&D) Proto 1 Low":
                tvnama.setText("Compass Research & Destroy (R&D) Proto 1 Low");
                tvnomor.setText("40 41 42");
                break;
            case "Compass x Pot Meets Pop High":
                tvnama.setText("Compass x Pot Meets Pop High");
                tvnomor.setText("43");
                break;
            case "Compass x Oldblue.co High":
                tvnama.setText("Compass x Oldblue.co High");
                tvnomor.setText("40 41");
                break;
            case "Compass x Elders High":
                tvnama.setText("Compass x Elders High");
                tvnomor.setText("42");
                break;
            case "Compass seri Low Indonesia Hebat ":
                tvnama.setText("Compass seri Low Indonesia Hebat ");
                tvnomor.setText("43");
                break;
        }
    }
}