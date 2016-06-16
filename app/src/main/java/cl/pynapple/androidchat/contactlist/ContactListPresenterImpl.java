package cl.pynapple.androidchat.contactlist;

import org.greenrobot.eventbus.Subscribe;

import cl.pynapple.androidchat.contactlist.events.ContactListEvent;
import cl.pynapple.androidchat.contactlist.ui.ContactListView;
import cl.pynapple.androidchat.entities.User;
import cl.pynapple.androidchat.lib.EventBus;
import cl.pynapple.androidchat.lib.GreenRobotEventBus;

/**
 * Created by Alvaro on 11-06-2016.
 */
public class ContactListPresenterImpl implements ContactListPresenter {
    private EventBus eventBus;
    private ContactListView view;
    private ContactListInteractor listInteractor;
    private ContactListSessionInteractor sessionInteractor;

    public ContactListPresenterImpl(ContactListView view) {
        this.view = view;
        this.eventBus = GreenRobotEventBus.getInstance();
        this.listInteractor = new ContactListInteractorImpl();
        this.sessionInteractor = new ContactListSessionInteractorImpl();
    }

    @Override
    public void onPause() {
        sessionInteractor.changeConnectionStatus(User.OFFLINE);
        listInteractor.unsubscribe();
    }

    @Override
    public void onResume() {
        sessionInteractor.changeConnectionStatus(User.ONLINE);
        listInteractor.subscribe();
    }

    @Override
    public void onCreate() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        eventBus.unregister(this);
        listInteractor.destroyListener();
        view = null;
    }

    @Override
    public void signOff() {
        sessionInteractor.changeConnectionStatus(User.OFFLINE);
        listInteractor.destroyListener();
        listInteractor.unsubscribe();
        sessionInteractor.signOff();
    }

    @Override
    public String getCurrentUserEmail() {
        return sessionInteractor.getCurrentUserEmail();
    }

    @Override
    public void removeContact(String email) {
        listInteractor.removeContact(email);
    }

    @Override
    @Subscribe
    public void onEventMainThread(ContactListEvent event) {
        User user = event.getUser();
        switch (event.getEventType()){
            case ContactListEvent.onContactAdded:
                onContactAdded(user);
                break;
            case ContactListEvent.onContactChanged:
                onContactChanged(user);
                break;
            case ContactListEvent.onContactRemoved:
                onContactRemoved(user);
                break;
        }
    }

    private void onContactAdded(User user){
        if(view != null){
            view.onContactAdded(user);
        }
    }

    private void onContactChanged(User user){
        if(view != null){
            view.onContactChanged(user);
        }
    }

    private void onContactRemoved(User user){
        if(view != null){
            view.onContactRemoved(user);
        }
    }
}
