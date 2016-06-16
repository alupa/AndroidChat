package cl.pynapple.androidchat.addcontact;

import org.greenrobot.eventbus.Subscribe;

import cl.pynapple.androidchat.addcontact.AddContactPresenter;
import cl.pynapple.androidchat.addcontact.events.AddContactEvent;
import cl.pynapple.androidchat.addcontact.ui.AddContactView;
import cl.pynapple.androidchat.lib.EventBus;
import cl.pynapple.androidchat.lib.GreenRobotEventBus;

/**
 * Created by Alvaro on 13-06-2016.
 */
public class AddContactPresenterImpl implements AddContactPresenter {
    private EventBus eventBus;
    private AddContactView view;
    private AddContactInteractor interactor;

    public AddContactPresenterImpl(AddContactView view) {
        this.view = view;
        this.eventBus = GreenRobotEventBus.getInstance();
        this.interactor = new AddContactInteractorImpl();
    }

    @Override
    public void onShow() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        view = null;
        eventBus.unregister(this);
    }

    @Override
    public void addContact(String email) {
        if (view != null){
            view.hideInput();
            view.showProgress();
        }
        interactor.execute(email);
    }

    @Override
    @Subscribe
    public void onEventMainThread(AddContactEvent event) {
        if (view != null){
            view.hideProgress();
            view.showInput();

            if (event.isError()){
                view.contactNoAdded();
            }else{
                view.contactAdded();
            }
        }
    }
}
