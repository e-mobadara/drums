package com.example.rick.drums.state;

import android.util.Log;

import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Implementation.AndroidGame;
import com.example.emobadaragaminglib.Implementation.AndroidSound;
import com.example.rick.drums.R;
import com.example.rick.drums.Screens.MainScreen;
import com.example.rick.drums.assets.Decor;
import com.example.rick.drums.assets.MusicInstr;

public class GameActivity extends AndroidGame {
    private static final String TAG = "GameActivity";

    @Override
    public Screen getInitScreen() {
        initAssets();
        Log.i(TAG, "getInitScreen: Assets are Loaded");
        return new MainScreen(this);
    }

    public void initAssets(){
        //Images
        MusicInstr.bass_image = getGraphics().newImage(R.drawable.bass,Graphics.ImageFormat.ARGB8888,getResources());
        MusicInstr.floor_tom_image = getGraphics().newImage(R.drawable.floor_tom,Graphics.ImageFormat.ARGB8888,getResources());
        MusicInstr.hihat_image = getGraphics().newImage(R.drawable.hihat,Graphics.ImageFormat.ARGB8888,getResources());
        MusicInstr.snare_image = getGraphics().newImage(R.drawable.snare,Graphics.ImageFormat.ARGB8888,getResources());
        Log.i(TAG, "initAssets: Loaded the Images");
        //Audio
        MusicInstr.bass_audio = (AndroidSound) getAudio().createSound(R.raw.kick);
        MusicInstr.floor_tom_audio = (AndroidSound) getAudio().createSound(R.raw.floor_tom);
        MusicInstr.hihat_audio = (AndroidSound) getAudio().createSound(R.raw.hi_hat_closed);
        MusicInstr.snare_audio = (AndroidSound) getAudio().createSound(R.raw.snare);
        Log.i(TAG, "initAssets: Loaded the Audio");
        //Decor
        Decor.bg = getGraphics().newImage(R.drawable.drums_bg,Graphics.ImageFormat.ARGB8888,getResources());
    }
}
