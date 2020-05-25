package com.u1065115.intentothers0525;

import android.app.DownloadManager;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (view.getId()){
            case R.id.btnEmail:
                intent.setData(Uri.parse("mailto:s940110118@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"'哈囉");
                intent.putExtra(Intent.EXTRA_TEXT,"'你好嗎?");
                break;

             case  R.id.btnWeb:
                 intent.setData(Uri.parse("http://www.csim.hk.edu.tw/main.php"));
                 break;

             case  R.id.btnMap:
                 intent.setData(Uri.parse("geo:23.8584022,120,9102202"));

            case  R.id.btnWebSearch:
                intent.setAction(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"弘光科技大學");

                break;

        }
        startActivity(intent);
    }
}
