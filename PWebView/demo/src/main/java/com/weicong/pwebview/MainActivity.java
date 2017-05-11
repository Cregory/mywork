package com.weicong.pwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.weicong.library.PWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PWebView pWebView = (PWebView) findViewById(R.id.webView);
        pWebView.loadUrl("http://www.baidu.com");
    }
}
