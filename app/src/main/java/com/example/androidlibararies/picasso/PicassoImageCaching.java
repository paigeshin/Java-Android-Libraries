package com.example.androidlibararies.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidlibararies.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class PicassoImageCaching extends AppCompatActivity {

    /*

    - Picasso provides a powerful combination of disk and memory cache
    - You can fine-control each cache with the appropriate settings

     */

    private ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_image_caching);

        ivPhoto = (ImageView) findViewById(R.id.imageView_picasso_caching1);

        Picasso
                .get()
                .setIndicatorsEnabled(true); //색깔별로 이미지의 출처가 어디서 나왔는지 표시해준다. - 사진마다 출처별로 다른 색깔 라벨이 붙어나옴.

        loadImageBitmapFromMemory();
        loadImageBitmapFromDisk();
        loadImageBitmapFromNetwork();
        loadImageBitmapFromCacheOnly();

    }

    private void loadImageBitmapFromMemory() {

//        Picasso
//                .get()
//                .load(UsageExampleListview.photo[0])
//                .fetch(new Callback() {
//                    @Override
//                    public void onSuccess() {
//                        Picasso
//                                .get()
//                                .load(UsageExampleListview.photo[0])
//                                .into(ivPhoto);
//                    }
//
//                    @Override
//                    public void onError(Exception e) {
//
//                    }
//                });

    }

    private void loadImageBitmapFromDisk() {

//        Picasso
//                .get()
//                .load(UsageExampleListview.photo[1])
//                .fetch(new Callback() {
//                    @Override
//                    public void onSuccess() {
//                        Picasso
//                                .get()
//                                .load(UsageExampleListView.eatFooddyImages[1])
//                                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)
//                                .into(ivPhoto);
//                    }
//
//                    @Override
//                    public void onError(Exception e) {
//
//                    }
//                });

    }

    private void loadImageBitmapFromNetwork() {
//        Picasso
//                .get()
//                .load(UsageExampleListView.eatFoodyImages[2])
//                .memoryPolicy(MemoryPolicy.NO_CACHE)
//                .networkPolicy(NetworkPolicy.NO_CACHE)
//                .into(ivPhoto);
    }

    private void loadImageBitmapFromCacheOnly() {
//        Picasso
//                .get()
//                .load(UsageExampleListView.eatFoodyImages[2])
//                .networkPolicy(NetworkPolicy.OFFLINE)      --- 인터넷이 연결되어 있어도 캐시에서 사진을 불러옴.
//                .into(ivPhoto);
    }
}
