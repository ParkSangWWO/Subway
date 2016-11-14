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
    TextView txtShtTransferMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);


        txtStatnFnm = (TextView) findViewById(R.id.txt_statnfnm);
        txtStatnTnm = (TextView) findViewById(R.id.txt_statntnm);
        txtMinstatCnt = (TextView) findViewById(R.id.txt_mintxtcnt);
        txtShtTransferMsg = (TextView) findViewById(R.id.txt_minstatnnm);
        txtShtTravelTm = (TextView) findViewById(R.id.txt_mintransfermsg);
        Intent intent = getIntent();
        RootClass shortestRouteList = (RootClass) intent.getSerializableExtra("request");
        txtStatnFnm.setText(shortestRouteList.getShortestRouteList()[0].getStatnFnm());
        txtStatnTnm.setText(shortestRouteList.getShortestRouteList()[0].getStatnTnm());
        txtMinstatCnt.setText(shortestRouteList.getShortestRouteList()[0].getMinStatnCnt());
        txtShtTravelTm.setText(shortestRouteList.getShortestRouteList()[0].getMinTransferMsg());
      String[] route = shortestRouteList.getShortestRouteList()[0].getMinStatnNm().split(",");
        txtShtTransferMsg.setText(route[0]);
        for(int i=1; i<route.length; i++) {
            txtShtTransferMsg.setText(txtShtTransferMsg.getText() + route[i]);
        }

    }
}

