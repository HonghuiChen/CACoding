package interface_adapter.clear_users;

// TODO Complete me


import interface_adapter.ViewModel;
import interface_adapter.login.LoginState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {

    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("Clear");
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    @Override
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }


    public void setState(ClearState state) {
        this.state = state;
    }
    public ClearState getState() {
        return state;
    }

    // No Constant label for buttons/fields needed.
}
