package cl.pynapple.androidchat.lib;

/**
 * Created by Alvaro on 09-06-2016.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
