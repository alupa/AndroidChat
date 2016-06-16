package cl.pynapple.androidchat.chat;

/**
 * Created by Alvaro on 13-06-2016.
 */
public interface ChatRepository {
    void changeConnectionStatus(boolean online);
    void sendMessage(String msg);
    void setRecipient(String recipient);

    void subscribe();
    void unsubscribe();
    void destroyListener();
}
