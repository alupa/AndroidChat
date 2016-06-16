package cl.pynapple.androidchat.addcontact.ui;

/**
 * Created by Alvaro on 13-06-2016.
 */
public interface AddContactView {
    void showInput();
    void hideInput();
    void showProgress();
    void hideProgress();

    void contactAdded();
    void contactNoAdded();
}
