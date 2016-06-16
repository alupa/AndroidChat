package cl.pynapple.androidchat.chat.ui;

import cl.pynapple.androidchat.entities.ChatMessage;

/**
 * Created by Alvaro on 13-06-2016.
 */
public interface ChatView {
    void onMessageRecieved(ChatMessage msg);
}
