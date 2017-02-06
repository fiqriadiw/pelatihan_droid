package com.example.d2j_00.tipscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void hitung(View view) {
        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        EditText input3 = (EditText) findViewById(R.id.input3);
        TextView hasil = (TextView) findViewById(R.id.result);
        double tagihan,tip,jmlorg,tip2 = 0,total = 0,org2 = 0;
        tagihan = Double.parseDouble(input1.getText().toString());
        tip = Double.parseDouble(input2.getText().toString());
        jmlorg = Double.parseDouble(input3.getText().toString());

        hasil.setText("TIPS :"+ Double.toString(tip2)+"\n"+
                        "TOTAL :"+ Double.toString(total)+"\n"+
                        "Per Orang :"+ Double.toString(org2));
}
}
