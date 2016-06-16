package cl.pynapple.androidchat.addcontact;

/**
 * Created by Alvaro on 13-06-2016.
 */
public class AddContactInteractorImpl implements AddContactInteractor {
    AddContactRepository repository;

    public AddContactInteractorImpl() {
        this.repository = new AddcontactRepositoryImpl();
    }

    @Override
    public void execute(String email) {
        repository.addContact(email);
    }
}
