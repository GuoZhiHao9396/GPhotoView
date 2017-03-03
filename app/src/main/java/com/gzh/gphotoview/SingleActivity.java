package com.gzh.gphotoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import photoview.PhotoViewAttacher;

/**
 * @ClassName: SingleActivity
 * @Description: 单张图片
 * @author: GZH
 */
public class SingleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);
        ImageView img = (ImageView) findViewById(R.id.img);
        new PhotoViewAttacher(img).update();
    }
}
