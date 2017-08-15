package com.projeto.meda.meda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timeTread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashScreen.this, TelaLogin.class);
                    startActivity(intent);
                }
            }
        };
        timeTread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
