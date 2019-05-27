package com.example.androidlibararies.zxing;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidlibararies.R;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class ZxingMainActivity2 extends AppCompatActivity {

    private Button scanQr;
    private TextView ResultText;
    //본격적으로 Zxing Code가 시작되는 시점
    private IntentIntegrator qrscan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zxing_main2);

        scanQr = (Button) findViewById(R.id.buttonQR);
        ResultText = (TextView) findViewById(R.id.Result_text);


        scanQr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qrscan = new IntentIntegrator(ZxingMainActivity2.this);
                qrscan.initiateScan();

            }
        });

    }

    //Zxing을 이용할 때, onActivityResult를 사용하는 것을 잊지말자!


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
            
            if(result != null){
                
                if(result.getContents() == null){
                    Toast.makeText(this, "No Result Found...!!", Toast.LENGTH_SHORT).show();
                } else {
                    ResultText.setText(result.getContents());
                    Toast.makeText(this, result.getContents(), Toast.LENGTH_SHORT).show();
                    //내가 zxing을 사용했을 때, 원하는 로직작성은 여기서하면 될 듯.
                }
                
            }

        super.onActivityResult(requestCode, resultCode, data);
    }


}
