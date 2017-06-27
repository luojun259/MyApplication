package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webview;
    @Override  // 初始化此方式会执行
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 加载布局文件
        this.setContentView(R.layout.activity_main);
        // 上面已经加载了布局文件,接下来要查找布局文件中的ViewView
//        WebView webView = (WebView)this.findViewById(R.id.webview);
        // 在android所有的可视化组件,都View的子类
//        webView.loadUrl("http://www.163.com");  // 加载互联网资源
        webview = (WebView) this.findViewById(R.id.webview);
        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);
        //设置在APP内部打开网址链接
        webview.setWebViewClient(new WebViewClient());

        //支持缩放
        settings.setUseWideViewPort(true);//设定支持viewport
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);//设定支持缩放

        //打开的网址
        webview.loadUrl("http://www.baidu.com");

    }
}
