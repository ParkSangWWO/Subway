package com.industrial.subway;

import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase;
import it.sephiroth.android.library.*;

public class MapActivity extends AppCompatActivity {

    private static final String LOG_TAG = "image-test";

    ImageViewTouch imgMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_map);

        Toast.makeText(getApplicationContext(), R.string.desc_zoom , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        imgMap = (ImageViewTouch) findViewById(R.id.image);

        // set the default image display type
        imgMap.setDisplayType(ImageViewTouchBase.DisplayType.FIT_IF_BIGGER);

        imgMap.setSingleTapListener(
                new ImageViewTouch.OnImageViewTouchSingleTapListener() {

                    @Override
                    public void onSingleTapConfirmed() {
                        Log.d(LOG_TAG, "onSingleTapConfirmed");
                    }
                }
        );

        imgMap.setDoubleTapListener(
                new ImageViewTouch.OnImageViewTouchDoubleTapListener() {

                    @Override
                    public void onDoubleTap() {
                        Log.d(LOG_TAG, "onDoubleTap");
                    }
                }
        );

        imgMap.setOnDrawableChangedListener(
                new ImageViewTouchBase.OnDrawableChangeListener() {

                    @Override
                    public void onDrawableChanged(Drawable drawable) {
                        Log.i(LOG_TAG, "onBitmapChanged: " + drawable);
                    }
                }
        );
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    Matrix imageMatrix;

    public void selectRandomImage(boolean small) {
        Cursor c = getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, null, null, null);
        if (c != null) {
            int count = c.getCount();
            //int position = (int) (Math.random() * count);
            int position = 0;
            if (c.moveToPosition(position)) {
                long id = c.getLong(c.getColumnIndex(MediaStore.Images.Media._ID));
                Uri imageUri = Uri.parse(MediaStore.Images.Media.EXTERNAL_CONTENT_URI + "/" + id);

                Log.d("image", imageUri.toString());

                final DisplayMetrics metrics = getResources().getDisplayMetrics();
                int size = (int) (Math.min(metrics.widthPixels, metrics.heightPixels) / 0.55);

                if (small) {
                    size /= 3;
                }

                Bitmap bitmap = DecodeUtils.decode(this, imageUri, size, size);
                Bitmap overlay = getOverlayBitmap("circle-black-medium.png");

                if (null != bitmap) {
                    Log.d(LOG_TAG, "screen size: " + metrics.widthPixels + "x" + metrics.heightPixels);
                    Log.d(LOG_TAG, "bitmap size: " + bitmap.getWidth() + "x" + bitmap.getHeight());

                    imgMap.setOnDrawableChangedListener(
                            new ImageViewTouchBase.OnDrawableChangeListener() {
                                @Override
                                public void onDrawableChanged(final Drawable drawable) {
                                    Log.v(LOG_TAG, "image scale: " + imgMap.getScale() + "/" + imgMap.getMinScale());
                                    Log.v(LOG_TAG, "scale type: " + imgMap.getDisplayType() + "/" + imgMap.getScaleType());

                                }
                            }
                    );
                    imgMap.setImageBitmap(bitmap, null, -1, -1);

                } else {
                    Toast.makeText(this, "Failed to load the image", Toast.LENGTH_LONG).show();
                }
            }
            c.close();
            return;
        }
    }

    private Bitmap getOverlayBitmap(String name) {
        String file = null;

        if (TextUtils.isEmpty(name)) {
            try {
                String[] files = getAssets().list("images");

                if (null != files && files.length > 0) {
                    int position = (int) (Math.random() * files.length);
                    file = files[position];
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            file = name;
        }

        try {
            InputStream stream = getAssets().open("images/" + file);
            try {
                return BitmapFactory.decodeStream(stream);
            } finally {
                stream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

