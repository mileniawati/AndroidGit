package com.dini.appatmdini;

/**
 * Created by Dini M on 21/02/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Transfer extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnok, btndel;
    EditText edittransfer, editsaldo;
    String tarik = "";
    int temp;
    int tab = 100000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penarikan);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btndel = (Button) findViewById(R.id.btndel);
        btnok = (Button) findViewById(R.id.btnok);
        edittransfer = (EditText) findViewById(R.id.edittransfer);
        editsaldo = (EditText) findViewById(R.id.editsaldo);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "0";
                edittransfer.setText(tarik);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "1";
                edittransfer.setText(tarik);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "2";
                edittransfer.setText(tarik);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "3";
                edittransfer.setText(tarik);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "4";
                edittransfer.setText(tarik);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "5";
                edittransfer.setText(tarik);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "6";
                edittransfer.setText(tarik);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "7";
                edittransfer.setText(tarik);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "8";
                edittransfer.setText(tarik);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "9";
                edittransfer.setText(tarik);
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik = "";
                edittransfer.setText(tarik);
            }
        });
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean valid;
                if (edittransfer.equals("")) {
                    edittransfer.setError("Masukkan Saldo Dengan Benar!");
                    valid = (false);
                } else {
                    int e = Integer.parseInt(tarik);
                    if (e < 50000) {
                        edittransfer.setError("Isi Saldo Minimal Rp 50.000!");
                        valid = (false);
                    } else {
                        isi(e);
                    }
                }
            }
        });
    }

    private void isi(int uang) {
        int tab = 100000;
        int h1 = Integer.parseInt(String.valueOf(edittransfer.getText()));
        int x = tab - h1;
        editsaldo.setText(String.valueOf(x));
    }
}

