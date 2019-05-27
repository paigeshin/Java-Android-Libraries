package com.example.androidlibararies.picasso;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidlibararies.R;
import com.squareup.picasso.Picasso;

import java.io.File;

public class PicassoImageResizing extends AppCompatActivity {

    /*

    - Picasso allows you to resize images with a single command
    - Scaling makes sure resized images don't get distorted too much
    - fit() minimizes the memory impact by resizing all images to their imageview.

     */

    private ImageView ivImage1,ivImage2,ivImage3,ivImage4,ivImage5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_image_resizing);

        //Image Resizing, Scaling & fit()

        ivImage1 = (ImageView) findViewById(R.id.imageView2);
        ivImage2 = (ImageView) findViewById(R.id.imageView3);
        ivImage3 = (ImageView) findViewById(R.id.imageView4);
        ivImage4 = (ImageView) findViewById(R.id.imageView5);
        ivImage5 = (ImageView) findViewById(R.id.imageView6);

    }

    private void loadImageWithResize(){
        String internetUrl = "https://futurestud.io/images/futurestudio-university-logo.png";
        Picasso
                .get()
                .load(internetUrl)
                .resize(600, 200)
                .into(ivImage1);
    }

    private void loadImageWithResizeCenterCrop(){
        String internetUrl = "https://futurestud.io/images/futurestudio-university-logo.png";
        Picasso
                .get()
                .load(internetUrl)
                .resize(600, 200)
                .centerCrop() //무조건 비율에 맞게
                .into(ivImage2);
    }

    private void loadImageWithResizeCenterInside(){
        String internetUrl = "https://futurestud.io/images/futurestudio-university-logo.png";
        Picasso
                .get()
                .load(internetUrl)
                .resize(600, 200)
                .centerInside() //안쪽중앙으로 정렬
                .into(ivImage3);
    }

    private void loadImageWithResizeScaleDown(){
        String internetUrl = "https://futurestud.io/images/futurestudio-university-logo.png";
        Picasso
                .get()
                .load(internetUrl)
                .resize(6000, 2000)
                .onlyScaleDown() //6000, 2000 크기가 넘어가면 다시 6000, 2000 크기로 맘ㅈ춤
                .into(ivImage4);
    }

    private void loadImageWithFit(){
        String internetUrl = "https://futurestud.io/images/futurestudio-university-logo.png";
        Picasso
                .get()
                .load(internetUrl)
                .fit() //fit() is measuring the dimensions of the target ImageView and internally uses resize() to reduce the image size to the dimensions of the ImageView
                .centerInside()
                .into(ivImage5);


    }

}
