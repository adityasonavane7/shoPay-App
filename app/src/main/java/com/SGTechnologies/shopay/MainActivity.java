package com.SGTechnologies.shopay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    Intent startLoading = new Intent(MainActivity.this,loadingScreen.class);
                    startActivity(startLoading);
                    finish();
                    Toast.makeText(MainActivity.this,"Finished Loading",Toast.LENGTH_SHORT).show();
                }
                catch(Exception e){
                    //TODO Handle exception
                }
            }
        });
        thread.start();

    }
}