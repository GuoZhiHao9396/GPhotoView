package com.gzh.gphotoview;

import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import photoview.PhotoView;
import photoview.ViewPagerFixed;

/**
 * @ClassName: MuchActivity
 * @Description: 多张图片
 * @author: GZH
 */
public class MuchActivity extends AppCompatActivity {

    int[] mimgs = {R.drawable.test, R.drawable.test, R.drawable.test};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_much);
        ViewPagerFixed vp = (ViewPagerFixed) findViewById(R.id.vp);
        vp.setAdapter(new MyAdapter());
    }

    class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mimgs.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            PhotoView p = new PhotoView(MuchActivity.this);
            p.setImageResource(mimgs[position]);
            container.addView(p);
            return p;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
