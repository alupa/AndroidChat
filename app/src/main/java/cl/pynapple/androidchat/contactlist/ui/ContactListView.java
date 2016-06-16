package cl.pynapple.androidchat.contactlist.ui;

import cl.pynapple.androidchat.entities.User;

/**
 * Created by Alvaro on 11-06-2016.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
