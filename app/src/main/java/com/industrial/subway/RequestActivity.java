package com.industrial.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.industrial.subway.network.RootClass;
import com.industrial.subway.network.ShortestRouteList;

public class RequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        Intent intent = getIntent();
        RootClass shortestRouteList = (RootClass) intent.getSerializableExtra("request");

        Toast.makeText(RequestActivity.this,shortestRouteList.getShortestRouteList().getMinStatnCnt(),Toast.LENGTH_SHORT).show();
    }
}
