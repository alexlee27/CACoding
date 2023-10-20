package use_case.clear_users;

// TODO Complete me

import java.time.LocalDateTime;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        LocalDateTime now = LocalDateTime.now();
        userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(now.toString(), false);
        userPresenter.prepareSuccessView(clearOutputData);
    }
}
