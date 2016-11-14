package com.industrial.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.industrial.subway.network.RequestService;
import com.industrial.subway.network.RootClass;
import com.industrial.subway.network.ShortestRouteList;
import com.rengwuxian.materialedittext.MaterialEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView btnShowmap;
    private MaterialEditText etEnter;
    private MaterialEditText etExit;
    private ImageView btnSearch;

    private String[] testArray = {"shtStatCnt"};
    private String Start = "사당";
    private String End = "소요산";
    private String key = "4956584b61736b793132344967757057";
    private RootClass rootClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();


    }

    private void initEvent() {
        btnShowmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enter = etEnter.getText().toString();
                String exit = etExit.getText().toString();

                if(!enter.isEmpty() && !exit.isEmpty()) {
                    Start = enter;
                    End = exit;
                }else {
                    Toast.makeText(MainActivity.this, "출발역과 도착역을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("http://swopenAPI.seoul.go.kr")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                final RequestService requestService = retrofit.create(RequestService.class);

                Call<RootClass> call = requestService.getRequest(
                        key, Start, End
                );

                call.enqueue(new Callback<RootClass>() {
                    @Override
                    public void onResponse(Call<RootClass> call, Response<RootClass> response) {
                        Log.d("MainActivity","success");
                        Intent intent = new Intent(MainActivity.this, RequestActivity.class);

                        rootClass = response.body();
                        intent.putExtra("request",rootClass);
                        startActivity(intent);
                    }

                    @Override
                    public void onFailure(Call<RootClass> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "역 명을 잘못 입력하셨습니다." , Toast.LENGTH_SHORT).show();
                        Log.d("MainActivity","Fail");
                        t.printStackTrace();
                    }
                });
            }
        });

        etEnter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        etExit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void initView() {
        btnSearch = (ImageView) findViewById(R.id.iv_search);
        btnShowmap = (TextView) findViewById(R.id.btn_show_map);
        etEnter = (MaterialEditText) findViewById(R.id.et_enter);
        etExit = (MaterialEditText) findViewById(R.id.et_exit);
    }


}
