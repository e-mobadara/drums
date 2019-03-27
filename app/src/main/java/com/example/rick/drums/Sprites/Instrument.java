package com.example.rick.drums.Sprites;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.emobadaragaminglib.Implementation.AndroidSound;

public class Instrument extends Sprite {
    private AndroidSound mAndroidSound;
    public Instrument(Image image, AndroidSound sound, int x, int y, int height, int width) {
        super( image, x, y, height, width);
        this.mAndroidSound = sound;
    }
    //we leave them static
    public void play(){
        this.mAndroidSound.play(1);
    }
}
