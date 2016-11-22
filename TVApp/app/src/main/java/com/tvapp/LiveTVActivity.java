package com.tvapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class LiveTVActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout homeLay, searchLay, hostLay, moreLay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_tv);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("");
        homeLay = (LinearLayout) findViewById(R.id.homeLay);
        searchLay = (LinearLayout) findViewById(R.id.searchLay);
        hostLay = (LinearLayout) findViewById(R.id.hostLay);
        moreLay = (LinearLayout) findViewById(R.id.moreLay);
        searchLay.setOnClickListener(this);
        hostLay.setOnClickListener(this);
        moreLay.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(), NewsListView.class));
    }
}
