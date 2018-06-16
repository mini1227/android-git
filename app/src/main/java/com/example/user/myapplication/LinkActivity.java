package com.example.user.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class LinkActivity extends Activity {
    private Button cake1;    private Button cake2;
    private Button cake3;    private Button cake4;
    private Button cake5;    private Button cake6;

    private Button bread1;   private Button bread2;
    private Button bread3;   private Button bread4;
    private Button bread5;   private Button bread6;

    private Button coockie1;  private Button coockie2;
    private Button coockie3;  private Button coockie4;
    private Button coockie5;  private Button coockie6;

    private Button rooll1;    private Button rooll2;
    private Button rooll3;    private Button rooll4;
    private Button rooll5;    private Button rooll6;

    private Button other1;    private Button other2;
    private Button other3;    private Button other4;
    private Button other5;    private Button other6;

    private Intent intent = new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);


        cake1 = (Button)findViewById(R.id.btn_link1);
        cake2 = (Button)findViewById(R.id.btn_link2);
        cake3 = (Button)findViewById(R.id.btn_link3);
        cake4 = (Button)findViewById(R.id.btn_link4);
        cake5 = (Button)findViewById(R.id.btn_link5);
        cake6 = (Button)findViewById(R.id.btn_link6);

        bread1 = (Button)findViewById(R.id.btn_link7);
        bread2 = (Button)findViewById(R.id.btn_link8);
        bread3 = (Button)findViewById(R.id.btn_link9);
        bread4 = (Button)findViewById(R.id.btn_link10);
        bread5 = (Button)findViewById(R.id.btn_link11);
        bread6 = (Button)findViewById(R.id.btn_link12);



        cake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://haruhii.pixnet.net/blog/post/31639479-%E6%8F%90%E6%8B%89%E7%B1%B3%E8%98%87%E9%A3%9F%E8%AD%9C"));
                startActivity(intent);

            }
        });

        cake2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://cookpad.com/tw/%E9%A3%9F%E8%AD%9C/2062538-%E8%97%8D%E8%8E%93%E6%AA%B8%E6%AA%AC%E7%94%9F%E4%B9%B3%E9%85%AA%E8%9B%8B%E7%B3%95%E5%85%8D%E7%83%A4"));
                startActivity(intent);

            }
        });

        cake3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/146556"));
                startActivity(intent);

            }
        });

        cake4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/138617"));
                startActivity(intent);

            }
        });

        cake5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.fooding.com.tw/recipe-shares.php?cookid=107781"));
                startActivity(intent);

            }
        });

        cake6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.fooding.com.tw/recipe-shares.php?cookid=107727"));
                startActivity(intent);

            }
        });

        bread1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/249554"));
                startActivity(intent);

            }
        });

        bread2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/249471"));
                startActivity(intent);

            }
        });

        bread3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(" https://icook.tw/recipes/249031"));
                startActivity(intent);

            }
        });

        bread4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(" https://icook.tw/recipes/248518"));
                startActivity(intent);

            }
        });

        bread5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/245712"));
                startActivity(intent);

            }
        });

        bread6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/247974"));
                startActivity(intent);

            }
        });



/*.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(""));
                startActivity(intent);

            }
        });

* */





    }

}
