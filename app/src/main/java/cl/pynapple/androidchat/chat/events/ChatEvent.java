package cl.pynapple.androidchat.chat.events;

import cl.pynapple.androidchat.entities.ChatMessage;

/**
 * Created by Alvaro on 13-06-2016.
 */
public class ChatEvent {
    ChatMessage message;

    public ChatMessage getMessage() {
        return message;
    }

    public void setMessage(ChatMessage message) {
        this.message = message;
    }
}
