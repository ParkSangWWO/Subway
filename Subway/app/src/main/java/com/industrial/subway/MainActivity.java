package com.industrial.subway;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {

    private ImageView imgSubway;
    PhotoViewAttacher Attacher;

    private Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();

        Attacher = new PhotoViewAttacher(imgSubway);
    }


    private void initView(){
        imgSubway = (ImageView)findViewById(R.id.img_subway);

        btnSearch = (Button)findViewById(R.id.btn_search);
    }

    private void initEvent(){

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

