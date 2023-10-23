package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
//    private final ClearViewModel clearViewModel;
//
//    public ClearPresenter(ClearViewModel clearViewModel) {
//        this.clearViewModel = clearViewModel;
//    }
//
//    public void prepareView(ClearOutputData response) {
//        ClearState clearState = clearViewModel.getState();
//        clearState.setClearedUsernames(response.getClearedUsernames());
//        clearViewModel.firePropertyChanged();
//
//
//    }
    private final SignupViewModel signupViewModel;

    public ClearPresenter(SignupViewModel signupViewModel) {
        this.signupViewModel = signupViewModel;
    }

    public void prepareView(ClearOutputData response) {
        SignupState state = signupViewModel.getState();
        state.setClearedUsernames(response.getClearedUsernames());
        signupViewModel.firePropertyChanged();

    }

}
