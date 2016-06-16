package cl.pynapple.androidchat.contactlist;

import cl.pynapple.androidchat.contactlist.events.ContactListEvent;

/**
 * Created by Alvaro on 11-06-2016.
 */
public interface ContactListPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
