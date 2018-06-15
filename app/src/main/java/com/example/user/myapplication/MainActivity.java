package com.example.user.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton bread1;   ImageButton  bread2;
    private ImageButton bread3;   ImageButton  bread4;
    private ImageButton bread5;   ImageButton  bread6;

    private ImageButton cake1;    private ImageButton cake2;
    private ImageButton cake3;    private ImageButton cake4;
    private ImageButton cake5;    private ImageButton cake6;

    private ImageButton coockie1; private ImageButton coockie2;
    private ImageButton coockie3; private ImageButton coockie4;
    private ImageButton coockie5; private ImageButton coockie6;

    private ImageButton other1;   private ImageButton other2;
    private ImageButton other3;   private ImageButton other4;
    private ImageButton other5;   private ImageButton other6;

    private ImageButton roll1;    private ImageButton roll2;
    private ImageButton roll3;    private ImageButton roll4;
    private ImageButton roll5;    private ImageButton roll6;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bread1 = (ImageButton)findViewById(R.id.bread01);   bread2 = (ImageButton)findViewById(R.id.bread02);
        bread3 = (ImageButton)findViewById(R.id.bread03);   bread4 = (ImageButton)findViewById(R.id.bread04);
        bread5 = (ImageButton)findViewById(R.id.bread05);   bread6 = (ImageButton)findViewById(R.id.bread06);

        cake1 = (ImageButton)findViewById(R.id.cake001);    cake2 = (ImageButton)findViewById(R.id.cake002);
        cake3 = (ImageButton)findViewById(R.id.cake003);    cake4 = (ImageButton)findViewById(R.id.cake004);
        cake5 = (ImageButton)findViewById(R.id.cake005);    cake6 = (ImageButton)findViewById(R.id.cake006);

        coockie1 = (ImageButton)findViewById(R.id.kie01);   coockie2 = (ImageButton)findViewById(R.id.kie02);
        coockie3 = (ImageButton)findViewById(R.id.kie03);   coockie4 = (ImageButton)findViewById(R.id.kie04);
        coockie5 = (ImageButton)findViewById(R.id.kie05);   coockie6 = (ImageButton)findViewById(R.id.kie06);

        other1 = (ImageButton)findViewById(R.id.other01);    other2 = (ImageButton)findViewById(R.id.other02);
        other3 = (ImageButton)findViewById(R.id.other03);    other4 = (ImageButton)findViewById(R.id.other04);
        other5 = (ImageButton)findViewById(R.id.other05);    other6 = (ImageButton)findViewById(R.id.other06);

        roll1 = (ImageButton)findViewById(R.id.roll001);      roll2 = (ImageButton)findViewById(R.id.roll002);
        roll3 = (ImageButton)findViewById(R.id.roll003);      roll4 = (ImageButton)findViewById(R.id.roll4);
        roll5 = (ImageButton)findViewById(R.id.roll5);        roll6 = (ImageButton)findViewById(R.id.roll6);

      bread1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Bread1.class);
                startActivity(intent);
            }
        });

        bread2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Bread2.class);
                startActivity(intent);
            }
        });

        bread3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Bread3.class);
                startActivity(intent);
            }
        });

        bread4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Bread4.class);
                startActivity(intent);
            }
        });

        bread5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Bread5.class);
                startActivity(intent);
            }
        });

        bread6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Bread6.class);
                startActivity(intent);
            }
        });

        cake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cake1.class);
                startActivity(intent);
            }
        });

        cake2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cake2.class);
                startActivity(intent);
            }
        });

        cake3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cake3.class);
                startActivity(intent);
            }
        });

        cake4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cake4.class);
                startActivity(intent);
            }
        });

        cake5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cake5.class);
                startActivity(intent);
            }
        });

        cake6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cake6.class);
                startActivity(intent);
            }
        });

        coockie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cookie1.class);
                startActivity(intent);
            }
        });

        coockie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cookie2.class);
                startActivity(intent);
            }
        });

        coockie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cookie3.class);
                startActivity(intent);
            }
        });

        coockie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cookie4.class);
                startActivity(intent);
            }
        });

        coockie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cookie5.class);
                startActivity(intent);
            }
        });

        coockie6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Cookie6.class);
                startActivity(intent);
            }
        });

        other1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Other1.class);
                startActivity(intent);
            }
        });

        other2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Other2.class);
                startActivity(intent);
            }
        });

        other3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Other3.class);
                startActivity(intent);
            }
        });

        other4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Other4.class);
                startActivity(intent);
            }
        });

        other5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Other5.class);
                startActivity(intent);
            }
        });

        other6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Other6.class);
                startActivity(intent);
            }
        });

        roll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Roll1.class);
                startActivity(intent);
            }
        });

        roll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Roll2.class);
                startActivity(intent);
            }
        });

        roll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Roll3.class);
                startActivity(intent);
            }
        });

        roll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Roll4.class);
                startActivity(intent);
            }
        });

        roll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Roll5.class);
                startActivity(intent);
            }
        });

        roll6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Roll6.class);
                startActivity(intent);
            }
        });











    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch(item.getItemId()){
            case R.id.action_tool:
                Intent intent_tool = new Intent();
                intent_tool.setClass(MainActivity.this,TOOL.class);
                startActivity(intent_tool);
                return true;
            case R.id.action_source:
                Intent intent_source = new Intent();
                intent_source.setClass(MainActivity.this,LinkActivity.class);
                startActivity(intent_source);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        }

}
