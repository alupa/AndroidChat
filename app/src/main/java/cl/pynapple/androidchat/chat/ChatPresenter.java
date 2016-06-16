package cl.pynapple.androidchat.chat;

import cl.pynapple.androidchat.chat.events.ChatEvent;

/**
 * Created by Alvaro on 13-06-2016.
 */
public interface ChatPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void setChatRecipient(String recipient);
    void sendMessage(String msg);
    void onEventMainThread(ChatEvent event);
}
