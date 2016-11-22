package com.tvapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.ListView;


public class NewsListView extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list_view);
        setTitle(Html.fromHtml(getResources().getString(R.string.news_top_stories)));
    }


}
