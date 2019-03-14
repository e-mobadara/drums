package com.example.rick.drums.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Implementation.AndroidImage;

import static android.support.v4.graphics.drawable.IconCompat.getResources;
import static java.security.AccessController.getContext;


/**
 * The role of this Class is to abstract all the functions and the same stuff that the musical
 * instrumentals have. Since they are all xml file we have to do the conversion to bitmap here
 * because the sprites are Loaded as bitmaps.
 */
public class MusicTool {
    /**
     * Convert xml to bitmap Image
     * @param resource It is going to be something like R.drawable.image
     * @return
     */
    /*
    //Gonna resolve the problem of using an xml svg image.
    public  Image ConvertToBitmap(int resource){
        Bitmap mBitmap = BitmapFactory.decodeResource(getResources(resource));
        return new AndroidImage(mBitmap,Graphics.ImageFormat.ARGB8888);

    }
    */
}
