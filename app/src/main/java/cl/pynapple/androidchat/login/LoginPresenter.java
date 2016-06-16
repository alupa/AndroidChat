package cl.pynapple.androidchat.login;

import cl.pynapple.androidchat.login.events.LoginEvent;

/**
 * Created by Alvaro on 09-06-2016.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void onResume();
    void onPause();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    void onEventMainThread(LoginEvent event);
}
