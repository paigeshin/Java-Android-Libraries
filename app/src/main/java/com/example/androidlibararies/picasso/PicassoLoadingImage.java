package com.example.androidlibararies.picasso;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidlibararies.R;
import com.squareup.picasso.Picasso;

import java.io.File;

public class PicassoLoadingImage extends AppCompatActivity {

    /*

    Picasso
     - makes it easy to load, cache and display images on Android
     - handles a lot of difficult aspects of image loading for you
     - can load images from URL, URI, file, Android resource

     */

    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_for_picasso);

        ivImage = findViewById(R.id.imageView);

    }

    private void loadImageByInternetUrl(){
        String internetUrl = "https://futurestud.io/images/futurestudio-university-logo.png";
        Picasso.get().load(internetUrl).into(ivImage);
    }

    private void loadImageByResourceId(){
        int resourceId = R.mipmap.ic_launcher;
        Picasso.get().load(resourceId).into(ivImage);
    }

    private void loadImageByFile(){
        //this file probably does not exist on your device. However, you can use any file path, whichh points to an image file.
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "anything.jpg");
        Picasso.get().load(file).into(ivImage);
    }

    private void loadImageByUri(){
        //this could be any Uri. for demonstration purposes we're just creating an Uri pointing to a launcher icon
        Uri uri = null; // = resourceToUri(context, R.mipmap.future_studio_launcher)
        Picasso.get().load(uri).into(ivImage);
    }

}
