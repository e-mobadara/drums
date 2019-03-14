package com.example.rick.drums.state;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Implementation.AndroidImage;
import com.example.rick.drums.R;
import com.example.rick.drums.assets.MusicInstr;

import static com.example.emobadaragaminglib.Base.Graphics.ImageFormat.ARGB8888;

public class LoadingActivity extends AppCompatActivity {

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent mIntent =  new Intent(LoadingActivity.this,GameActivity.class);
            LoadingActivity.this.startActivity(mIntent);
            //For The animation
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Have a full Screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Setting the Layout
        setContentView(R.layout.activity_loading);

        //Loading the Gif
        ImageView mImageView = (ImageView) findViewById(R.id.drum_start);
        Glide.with(this)
                .load(R.drawable.drums_start)
                .into(mImageView);

        //Wait for the Loading of the Assets and Starting the Game
        handler.postDelayed(runnable,4000);
    }

    private void LoadAssests(){
        //Load all the assets here while loading
        //Unfortunately we can't until we have a Game object. Sucks right?
        //It should't be this way. I agree
    }
}
