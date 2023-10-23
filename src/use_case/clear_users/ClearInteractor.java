package use_case.clear_users;

// TODO Complete me

public class ClearInteractor  {
    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface ClearUserDataAccessInterface,
                           ClearOutputBoundary ClearOutputBoundary) {
        this.userDataAccessObject = ClearUserDataAccessInterface;
        this.userPresenter = ClearOutputBoundary;
    }

    public void execute() {
        ClearOutputData clearOutputData = new ClearOutputData(userDataAccessObject.clearAll());
        userPresenter.prepareView(clearOutputData);
    }

}
