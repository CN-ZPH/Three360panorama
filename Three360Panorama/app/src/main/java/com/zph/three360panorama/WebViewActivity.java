package com.zph.three360panorama;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;
/**
 * Created by 張鵬輝 on 2017/8/29.
 *
 * E-mail: 1344670918@qq.com
 *
 * CSDN: http://blog.csdn.net/QingTianGG
 *
 * 有问题欢迎随时来找我共同解决
 */
public class WebViewActivity extends AppCompatActivity {
    private com.tencent.smtt.sdk.WebView tencent_webview;
    private String url = "file:///android_asset/admin.html";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        initView();
    }
    @SuppressLint("SetJavaScriptEnabled")
    private void initView() {
        tencent_webview = (WebView) findViewById(R.id.web);
        tencent_webview.loadUrl(url);
        WebSettings webSettings = tencent_webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        tencent_webview.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return true;
            }
        });
    }
}
