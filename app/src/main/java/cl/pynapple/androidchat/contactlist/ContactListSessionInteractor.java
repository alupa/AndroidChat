package cl.pynapple.androidchat.contactlist;

/**
 * Created by Alvaro on 11-06-2016.
 */
public interface ContactListSessionInteractor {
    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
}
