package cl.pynapple.androidchat.lib;

import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Alvaro on 11-06-2016.
 */
public interface ImageLoader {
    void load(ImageView imgAvatar, String url);
}
