package tech.fpax.calculanyut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 Button tambah,kurang,bagi,kali,bersihkan;
 TextView hasil;
 EditText angka_pertama , angka_kedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        bersihkan = findViewById(R.id.bersihkan);

        angka_pertama = findViewById(R.id.angka_pertama);
        angka_kedua = findViewById(R.id.angka_kedua);

        hasil = findViewById(R.id.hasil);

        tambah.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //Create the intent to start another activity
               double HasilX = Double.parseDouble(angka_pertama.getText().toString()) + Double.parseDouble(angka_kedua.getText().toString());
                hasil.setText(String.valueOf(HasilX));
            }
        });

        bagi.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //Create the intent to start another activity
                double HasilX = Double.parseDouble(angka_pertama.getText().toString()) / Double.parseDouble(angka_kedua.getText().toString());
                hasil.setText(String.valueOf(HasilX));
            }
        });

        kurang.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //Create the intent to start another activity
                double HasilX = Double.parseDouble(angka_pertama.getText().toString()) - Double.parseDouble(angka_kedua.getText().toString());
                hasil.setText(String.valueOf(HasilX));
            }
        });

        kali.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //Create the intent to start another activity
                double HasilX = Double.parseDouble(angka_pertama.getText().toString()) * Double.parseDouble(angka_kedua.getText().toString());
                hasil.setText(String.valueOf(HasilX));
            }
        });

        bersihkan.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //Create the intent to start another activity
               hasil.setText("0");
               angka_pertama.setText("");
               angka_kedua.setText("");
            }
        });
    }
}
