package com.example.rick.drums.Screens;

import android.util.Log;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.rick.drums.Sprites.Instrument;
import com.example.rick.drums.assets.Decor;
import com.example.rick.drums.assets.MusicInstr;

public class MainScreen extends Screen {
    private static final String TAG = "MainScreen";

    private Instrument floor_tom
                        ,snare
                        ,bass
                        ,hihat;
    private Sprite bg;
    public MainScreen(Game game) {
        super(game);
        Log.i(TAG, "MainScreen: Initialized the Screen");
        floor_tom = new Instrument(game,MusicInstr.floor_tom_image,MusicInstr.floor_tom_audio,0,100,100,100);
        snare = new Instrument(game,MusicInstr.snare_image,MusicInstr.snare_audio,0,200,100,100);
        bass = new Instrument(game,MusicInstr.bass_image,MusicInstr.bass_audio,0,300,100,100);
        hihat = new Instrument(game,MusicInstr.hihat_image,MusicInstr.hihat_audio,0,400,100,100);
        bg = new Sprite(game,Decor.bg,0,0,game.getGraphics().getHeight(),game.getGraphics().getWidth());
        addSprite(bg);
        addSprite(floor_tom);
        addSprite(snare);
        addSprite(bass);
        addSprite(hihat);

        floor_tom.draw(game);
        bass.draw(game);
        hihat.draw(game);
        hihat.draw(game);
        bg.draw(game);
    }

    @Override
    public void render(float deltaTime) {

    }

    @Override
    public void handleTouchDown(int x, int y, int pointer) {
        super.handleTouchDown(x, y, pointer);
        Sprite s = getDraggedSprite();
        Log.i(TAG, "handleTouchDown: S class is: "+s.getClass());
        if(s!=null && s.getClass()==Instrument.class){
            //a way around a little problem I had
            Instrument ss = (Instrument) s;
            ss.play();
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void backButton() {

    }
}
