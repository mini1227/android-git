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

public class MainActivity extends AppCompatActivity {

    private Button bread1;   private Button bread2;
    private Button bread3;   private Button bread4;
    private Button bread5;   private Button bread6;

    private Button cake1;    private Button cake2;
    private Button cake3;    private Button cake4;
    private Button cake5;    private Button cake6;

    private Button coockie1; private Button coockie2;
    private Button coockie3; private Button coockie4;
    private Button coockie5; private Button coockie6;

    private Button other1;   private Button other2;
    private Button other3;   private Button other4;
    private Button other5;   private Button other6;

    private Button roll1;    private Button roll2;
    private Button roll3;    private Button roll4;
    private Button roll5;    private Button roll6;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bread1 = (Button)findViewById(R.id.bread01);   bread2 = (Button)findViewById(R.id.bread02);
        bread3 = (Button)findViewById(R.id.bread03);   bread4 = (Button)findViewById(R.id.bread04);
        bread5 = (Button)findViewById(R.id.bread05);   bread6 = (Button)findViewById(R.id.bread06);

        cake1 = (Button)findViewById(R.id.cake001);    cake2 = (Button)findViewById(R.id.cake002);
        cake3 = (Button)findViewById(R.id.cake003);    cake4 = (Button)findViewById(R.id.cake004);
        cake5 = (Button)findViewById(R.id.cake005);    cake6 = (Button)findViewById(R.id.cake006);

        coockie1 = (Button)findViewById(R.id.kie01);   coockie2 = (Button)findViewById(R.id.kie02);
        coockie3 = (Button)findViewById(R.id.kie03);   coockie4 = (Button)findViewById(R.id.kie04);
        coockie5 = (Button)findViewById(R.id.kie05);   coockie6 = (Button)findViewById(R.id.kie06);

        other1 = (Button)findViewById(R.id.other01);    other2 = (Button)findViewById(R.id.other02);
        other3 = (Button)findViewById(R.id.other03);    other4 = (Button)findViewById(R.id.other04);
        other5 = (Button)findViewById(R.id.other05);    other6 = (Button)findViewById(R.id.other06);

        roll1 = (Button)findViewById(R.id.roll001);      roll2 = (Button)findViewById(R.id.roll002);
        roll3 = (Button)findViewById(R.id.roll003);      roll4 = (Button)findViewById(R.id.roll4);
        roll5 = (Button)findViewById(R.id.roll5);        roll6 = (Button)findViewById(R.id.roll6);

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
            }
        });

        roll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Roll2.class);
            }
        });

        roll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Roll3.class);
            }
        });

        roll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Roll4.class);
            }
        });

        roll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Roll5.class);
            }
        });

        roll6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Roll6.class);
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
