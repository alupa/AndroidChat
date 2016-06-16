package cl.pynapple.androidchat.contactlist;

/**
 * Created by Alvaro on 11-06-2016.
 */
public interface ContactListRepository {
    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
    void subscribeToContactListEvents();
    void unsubscribeToContactListEvents();
    void destroyListener();
    void removeContact(String email);
}
