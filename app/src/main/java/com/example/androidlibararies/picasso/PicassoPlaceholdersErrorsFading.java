package com.example.androidlibararies.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidlibararies.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class PicassoPlaceholdersErrorsFading extends AppCompatActivity {

    /*

    - Placeholder as .. Placeholder
    - Error placeholder
    - noFade()
    - noPlaceholder()

     */


    private ImageView iv1, iv2, iv3, iv4, iv5;

    private String imageUrl = "https://i.imgur.com/RHtoQ9Z.jpg";
    private String imageUrl2 = "https://i.pinimg.com/originals/6f/3f/24/6f3f246ea358c677657f527b512a6583.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_placeholders_errors_fading);

        iv1 = findViewById(R.id.picassoTutorial4_iv1);
        iv2 = findViewById(R.id.picassoTutorial4_iv2);
        iv3 = findViewById(R.id.picassoTutorial4_iv3);
        iv4 = findViewById(R.id.picassoTutorial4_iv4);
        iv5 = findViewById(R.id.picassoTutorial4_iv5);

        loadImageWithPlaceHolder();
        loadImageWithError();
        loadImageNoFade();
        loadImageCombination();
        loadImageWithNoPlaceHolder();

    }

    private void loadImageWithPlaceHolder() {

        Picasso
                .get()
                .load(imageUrl)
                .placeholder(R.mipmap.ic_launcher) // can also be a drawable   -- 이미지가 로드되기 전에 나와있는 이미지.
                .into(iv1);

    }

    private void loadImageWithError(){

        Picasso
                .get()
                .load("nothing")
                .error(R.mipmap.ic_launcher) //will be displayed if the image cannot be loaded
                .into(iv2);

    }

    private void loadImageNoFade(){

        Picasso
                .get()
                .load(imageUrl)
                .noFade()
                .into(iv3);

    }

    private void loadImageCombination(){

        Picasso
                .get()
                .load(imageUrl)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .noFade()
                .into(iv4);

    }

    private void loadImageWithNoPlaceHolder(){

        Picasso
                .get()
                .load(imageUrl)
                .placeholder(R.mipmap.ic_launcher) //can also be a drawable
                .into(iv5, new Callback() {
                    @Override
                    public void onSuccess() {
                        //Once the image is loaded, load the next image
                        Picasso
                                .get()
                                .load(imageUrl2)
                                .noPlaceholder()
                                .into(iv5);
                    }

                    @Override
                    public void onError(Exception e) {

                    }
                });

    }

}
