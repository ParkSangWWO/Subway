package com.industrial.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.industrial.subway.network.RootClass;
import com.industrial.subway.network.ShortestRouteList;

public class RequestActivity extends AppCompatActivity {

    TextView txtStatnTnm;
    TextView txtStatnFnm;
    TextView txtMinstatCnt;
    TextView txtShtTravelTm;
    TextView txtShtStatnNm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        initView();
        initEvent();

    }

    private void initEvent() {
        txtStatnFnm = (TextView) findViewById(R.id.txt_statnfnm);
        txtStatnTnm = (TextView) findViewById(R.id.txt_statntnm);
        txtMinstatCnt = (TextView) findViewById(R.id.txt_mintxtcnt);
        txtShtStatnNm = (TextView) findViewById(R.id.txt_shtstatnnm);
        txtShtTravelTm = (TextView) findViewById(R.id.txt_shttraveltm);
    }

    private void initView() {
        Intent intent = getIntent();
        RootClass shortestRouteList = (RootClass) intent.getSerializableExtra("request");
        txtStatnFnm.setText(shortestRouteList.getShortestRouteList()[0].getStatnFnm());
        txtStatnTnm.setText(shortestRouteList.getShortestRouteList()[0].getStatnTnm());
        txtMinstatCnt.setText(shortestRouteList.getShortestRouteList()[0].getMinStatnCnt());
        txtShtStatnNm.setText(shortestRouteList.getShortestRouteList()[0].getShtStatnNm());
        String[] route = shortestRouteList.getShortestRouteList()[0].getShtTravelTm().split(",");
        txtShtTravelTm.setText(route[0]);
        for(int i=1; i<route.length; i++) {
            txtShtTravelTm.setText(txtShtTravelTm.getText() + " > " + route[i]);
        }
    }
}

