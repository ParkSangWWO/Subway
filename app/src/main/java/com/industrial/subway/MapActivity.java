package com.industrial.subway;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import com.industrial.subway.uk.co.senab.photoview.PhotoViewAttacher;


public class MapActivity extends AppCompatActivity {

    private static final String LOG_TAG = "image-test";

    ImageView imgSubway;
    PhotoViewAttacher attacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Toast.makeText(getApplicationContext(), R.string.desc_zoom, Toast.LENGTH_SHORT).show();

        imgSubway = (ImageView) findViewById(R.id.img_subway);
        attacher = new PhotoViewAttacher(imgSubway);
    }

}

