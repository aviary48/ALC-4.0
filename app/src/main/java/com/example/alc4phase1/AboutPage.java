package com.example.alc4phase1;

import android.app.Activity;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class AboutPage extends AppCompatActivity {


    private WebView mWebview ;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        mWebview = findViewById(R.id.webview);
        WebSettings webSettings = mWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setDomStorageEnabled(true);
        mWebview.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        mWebview.loadUrl("https://www.andela.com/alc/");
    }
}

//public class AboutPage extends AppCompatActivity {
//
//
//    private WebView mWebview ;
//
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_about);
//
//
//        mWebview = findViewById(R.id.webview);
//        WebSettings webSettings = mWebview.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
//        webSettings.setDomStorageEnabled(true);
//        mWebview.setWebViewClient(new WebViewClient(){
//            @Override
//            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
//                handler.proceed();
//            }
//        });
//        mWebview.loadUrl("https://www.andela.com/alc/");
//
////        mWebview = findViewById(R.id.webview);
////        mWebview.getSettings().setJavaScriptEnabled(true);
////        mWebview.getSettings().setLoadWithOverviewMode(true);
////        mWebview.getSettings().setUseWideViewPort(true);
////        mWebview.setWebViewClient(new WebViewClient());
////
////
////        try{
////            mWebview.loadUrl("https://andela.com/alc/");
////        } catch (Exception e ){
////            e.printStackTrace();
////        }
//
//
////        mWebview  = new WebView(this);
////
////        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript
////
////        final Activity activity = this;
////
////        mWebview.setWebViewClient(new WebViewClient() {
////            @SuppressWarnings("deprecation")
////            @Override
////            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
////                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
////            }
//////            @TargetApi(android.os.Build.VERSION_CODES.M)
//////            @Override
////            @RequiresApi(api = Build.VERSION_CODES.M)
////            public void onReceivedError(WebView view, WebResourceRequest req, WebResourceError rerr) {
////                // Redirect to deprecated method, so you can use it in all SDK versions
////                onReceivedError(view, rerr.getErrorCode(), rerr.getDescription().toString(), req.getUrl().toString());
////            }
////        });
////
////        mWebview .loadUrl("https://andela.com/alc/");
////        setContentView(mWebview );
//
//
//    }
//
//    public boolean overideUrlLoading(WebView view, String url){
//        view.loadUrl(url);
//        return true;
//    }
//public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
//        handler.proceed();
//}
//
//
//}
