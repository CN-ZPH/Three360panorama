package com.zph.three360panorama;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by 張鵬輝 on 2017/8/29.
 * <p>
 * E-mail: 1344670918@qq.com
 * <p>
 * CSDN: http://blog.csdn.net/QingTianGG
 * <p>
 * 有问题欢迎随时来找我共同解决
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }
    Intent intent = new Intent();

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:

                intent.setClass(MainActivity.this, OpenGLActivity.class);
                this.startActivity(intent);
                break;
            case R.id.button2:
                intent.setClass(MainActivity.this, GoogleVRActivity.class);
                this.startActivity(intent);
                break;
            case R.id.button3:
                intent.setClass(MainActivity.this, WebViewActivity.class);
                this.startActivity(intent);
                break;
            default:
                break;
        }
    }
}
