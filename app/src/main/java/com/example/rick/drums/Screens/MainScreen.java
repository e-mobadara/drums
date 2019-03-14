package com.example.rick.drums.Screens;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.rick.drums.Sprites.Instrument;
import com.example.rick.drums.assets.MusicInstr;

public class MainScreen extends Screen {
    private Instrument floor_tom
                        ,snare
                        ,bass
                        ,hihat;
    public MainScreen(Game game) {
        super(game);
        floor_tom = new Instrument(game,MusicInstr.floor_tom_image,MusicInstr.floor_tom_audio,0,100,100,100);
        snare = new Instrument(game,MusicInstr.snare_image,MusicInstr.snare_audio,0,200,100,100);
        bass = new Instrument(game,MusicInstr.bass_image,MusicInstr.bass_audio,0,300,100,100);
        hihat = new Instrument(game,MusicInstr.hihat_image,MusicInstr.hihat_audio,0,400,100,100);
    }

    @Override
    public void render(float deltaTime) {

    }

    @Override
    public void handleTouchDown(int x, int y, int pointer) {
        super.handleTouchDown(x, y, pointer);
        Instrument s = (Instrument)getDraggedSprite();
        s.play();
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
