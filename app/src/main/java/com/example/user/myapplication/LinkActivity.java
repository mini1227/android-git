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

    private Button cookie1;  private Button cookie2;
    private Button cookie3;  private Button cookie4;
    private Button cookie5;  private Button cookie6;

    private Button rooll1;    private Button rooll2;
    private Button rooll3;    private Button rooll4;
    private Button rooll5;    private Button rooll6;

    private Button other1;    private Button other2;
    private Button other3;    private Button other4;
    private Button other5;    private Button other6;

    private Intent intent = new Intent();

    public LinkActivity() {
    }

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

        rooll1 = (Button)findViewById(R.id.btn_link13);
        rooll2 = (Button)findViewById(R.id.btn_link14);
        rooll3 = (Button)findViewById(R.id.btn_link15);
        rooll4 = (Button)findViewById(R.id.btn_link16);
        rooll5 = (Button)findViewById(R.id.btn_link17);
        rooll6 = (Button)findViewById(R.id.btn_link18);

        cookie1 = (Button)findViewById(R.id.btn_link19);
        cookie2 = (Button)findViewById(R.id.btn_link20);
        cookie3 = (Button)findViewById(R.id.btn_link21);
        cookie4 = (Button)findViewById(R.id.btn_link22);
        cookie5 = (Button)findViewById(R.id.btn_link23);
        cookie6 = (Button)findViewById(R.id.btn_link24);

        other1 = (Button)findViewById(R.id.btn_link25);
        other2 = (Button)findViewById(R.id.btn_link26);
        other3 = (Button)findViewById(R.id.btn_link27);
        other4 = (Button)findViewById(R.id.btn_link28);
        other5 = (Button)findViewById(R.id.btn_link29);
        other6 = (Button)findViewById(R.id.btn_link30);




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
                intent.setData(Uri.parse("https://icook.tw/recipes/249031"));
                startActivity(intent);

            }
        });

        bread4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/248518"));
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

        rooll1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/232314"));
                startActivity(intent);

            }
        });

        rooll2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/234078"));
                startActivity(intent);

            }
        });

        rooll3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/242231"));
                startActivity(intent);

            }
        });

        rooll4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/216778"));
                startActivity(intent);

            }
        });

        rooll5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/77530"));
                startActivity(intent);

            }
        });

        rooll6.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/244161"));
                startActivity(intent);

            }
        });

        cookie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/107943"));
                startActivity(intent);
            }
        });

        cookie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/142103"));
                startActivity(intent);
            }
        });

        cookie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/194968"));
                startActivity(intent);
            }
        });

        cookie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/69203"));
                startActivity(intent);
            }
        });

        cookie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://kuanming-style.blogspot.tw/2014/12/lemon-biscuits.html?m=1"));
                startActivity(intent);
            }
        });

        cookie6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/82446"));
                startActivity(intent);
            }
        });

        other1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://yummymum.tw/2017-04-28-1110/"));
                startActivity(intent);
            }
        });

        other2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/249758"));
                startActivity(intent);
            }
        });

        other3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://yfwu0420.pixnet.net/blog/post/382636817-%2A%5B%E8%A6%AA%E5%AD%90%E7%94%9C%E9%BB%9E%5D-%E8%B6%85%E5%A5%BD%E5%90%83%E7%9A%84%E6%B3%95%E5%BC%8F%E5%8D%83%E5%B1%A4%E8%9B%8B%E7%B3%95%E4%B8%8D%E6%B1%82%E4%BA%BA%E8%87%AA"));
                startActivity(intent);
            }
        });

        other4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://cookpad.com/tw/%E9%A3%9F%E8%AD%9C/2087945-%E6%8A%B9%E8%8C%B6%E5%A5%B6%E6%B2%B9%E6%B3%A1%E8%8A%99"));
                startActivity(intent);
            }
        });

        other5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/35970"));
                startActivity(intent);
            }
        });

        other6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://icook.tw/recipes/246577"));
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
