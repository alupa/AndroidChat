package cl.pynapple.androidchat.addcontact.events;

/**
 * Created by Alvaro on 13-06-2016.
 */
public class AddContactEvent {
    boolean error = false;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
