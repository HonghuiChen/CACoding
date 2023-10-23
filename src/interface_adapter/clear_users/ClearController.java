package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInteractor;

// TODO Complete me
public class ClearController {

    final ClearInteractor clearUserUseCaseInterator;

    public ClearController(ClearInteractor clearUserUseCaseInterator){
        this.clearUserUseCaseInterator = clearUserUseCaseInterator;
    }

    public void execute(){
        clearUserUseCaseInterator.execute();
    }

}
