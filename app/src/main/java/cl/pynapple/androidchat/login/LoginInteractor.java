package cl.pynapple.androidchat.login;

/**
 * Created by Alvaro on 09-06-2016.
 */
public interface LoginInteractor {
    void checkSession();
    void doSignUp(String email, String password);
    void doSignIn(String email, String password);
}
