package com.example.appmobilegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                finish();
                System.exit(0);
            }
        });

    }
    public void openApp(View view){
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.DefaultCompany.TicTacToe");

        if(launchIntent != null){
            startActivity(launchIntent);

        }else{
            Toast.makeText(MainActivity.this, "AAAAAAAAAA", Toast.LENGTH_SHORT).show();
        }
    }
    public void openSpider(View view){
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.Company.ProductName1");

        if(launchIntent != null){
            startActivity(launchIntent);

        }else{
            Toast.makeText(MainActivity.this, "AAAAAAAAAA", Toast.LENGTH_SHORT).show();
        }
    }
    public void open2048(View view){
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.DeantKay.DK2048");

        if(launchIntent != null){
            startActivity(launchIntent);

        }else{
            Toast.makeText(MainActivity.this, "AAAAAAAAAA", Toast.LENGTH_SHORT).show();
        }
    }



}