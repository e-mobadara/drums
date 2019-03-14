package com.example.rick.drums.state;

import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Implementation.AndroidAudio;
import com.example.emobadaragaminglib.Implementation.AndroidGame;
import com.example.emobadaragaminglib.Implementation.AndroidImage;
import com.example.emobadaragaminglib.Implementation.AndroidSound;
import com.example.rick.drums.R;
import com.example.rick.drums.Screens.MainScreen;
import com.example.rick.drums.assets.MusicInstr;

public class GameActivity extends AndroidGame {

    @Override
    public Screen getInitScreen() {
        initAssets();
        return new MainScreen(this);
    }

    public void initAssets(){
        //Images
        MusicInstr.bass_image = getGraphics().newImage(R.drawable.bass,Graphics.ImageFormat.ARGB8888,getResources());
        MusicInstr.floor_tom_image = getGraphics().newImage(R.drawable.floor_tom,Graphics.ImageFormat.ARGB8888,getResources());
        MusicInstr.hihat_image = getGraphics().newImage(R.drawable.hihat,Graphics.ImageFormat.ARGB8888,getResources());
        MusicInstr.snare_image = getGraphics().newImage(R.drawable.snare,Graphics.ImageFormat.ARGB8888,getResources());

        //Audio
        MusicInstr.bass_audio = (AndroidSound) getAudio().createSound(R.raw.Kick);
        MusicInstr.floor_tom_audio = (AndroidSound) getAudio().createSound(R.raw.Floor_Tom);
        MusicInstr.hihat_audio = (AndroidSound) getAudio().createSound(R.raw.Hi_Hat_Closed);
        MusicInstr.snare_audio = (AndroidSound) getAudio().createSound(R.raw.Snare);
    }
}
