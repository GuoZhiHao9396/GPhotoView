# GPhotoView
#图片浏览控件

![image](https://github.com/GuoZhiHao9396/GPhotoView/blob/master/app/src/main/res/raw/test.gif)

AndroidStudio使用Gradle构建添加依赖（推荐）

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
```java
    dependencies {
	   compile files('libs/gphotolibrary-v1.0.0.jar')
	}
```

#使用介绍

单张
```xml
<ImageView
        android:id="@+id/img"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:src="@drawable/test"/>
```

```java
        ImageView img = (ImageView) findViewById(R.id.img);
        new PhotoViewAttacher(img).update();
```

多张
```xml
 <photoview.ViewPagerFixed
        android:id="@+id/vp"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```

```java
   ViewPagerFixed vp = (ViewPagerFixed) findViewById(R.id.vp);
   vp.setAdapter(new MyAdapter());

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
```
#License
```text
Copyright 2017 ZhiHao Guo

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
