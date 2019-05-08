package com.webview.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.webview.app.utils.X5WebView;

public class MainActivity extends Activity {

    private X5WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mWebView = (X5WebView) this.findViewById(R.id.mWebView);
        this.mWebView.loadUrl("http://ucenter.jimiws.com/server/question.html?kehuduan=xiaoxi");

    }

    public void jump(View view){
        Intent intent = new Intent(this, FullScreenActivity.class);
        startActivity(intent);
    }
}
