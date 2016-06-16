package cl.pynapple.androidchat.contactlist.ui.adapters;

import cl.pynapple.androidchat.entities.User;

/**
 * Created by Alvaro on 11-06-2016.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
