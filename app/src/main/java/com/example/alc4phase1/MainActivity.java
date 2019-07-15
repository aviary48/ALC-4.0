package com.example.alc4phase1;

import android.content.Intent;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Button aboutPage = findViewById(R.id.button1);
       final Button profile = findViewById(R.id.button2);

        aboutPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this, AboutPage.class );
                startActivity(intent);

            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }


//    public WebViewClient getWebClient(){
//        return new WebViewClient(){
//
//            public  void onReceivedSslError(WebView view, SslErrorHandler handler, SslError){
//                handler.proceed();
//            }
//        }
//    }
}
