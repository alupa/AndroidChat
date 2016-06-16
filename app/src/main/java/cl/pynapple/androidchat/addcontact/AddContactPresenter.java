package cl.pynapple.androidchat.addcontact;

import cl.pynapple.androidchat.addcontact.events.AddContactEvent;

/**
 * Created by Alvaro on 13-06-2016.
 */
public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}
