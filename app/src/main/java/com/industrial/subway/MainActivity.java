package com.industrial.subway;

import android.content.Intent;
import android.media.Image;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.industrial.subway.util.Request;
import com.rengwuxian.materialedittext.MaterialEditText;

public class MainActivity extends AppCompatActivity {

    private TextView btnShowmap;
    private MaterialEditText etEnter;
    private MaterialEditText etExit;
    private ImageView btnSearch;

    private String[] testArray = {"shtStatCnt"};
    private Request request = new Request();
    private String Start = "사당";
    private String End = "소요산";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();

        new Thread() {
            public void run() {
                request = new Request("4956584b61736b793132344967757057", Start, End , testArray);
            }
        }.start();

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

                    request.Read();
                    request.Json();
                    request.GetResult();
                }else {
                    Toast.makeText(MainActivity.this, "출발역과 도착역을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
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
