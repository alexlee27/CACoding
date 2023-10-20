package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {

    private String deletionTime;

    private boolean useCaseFailed;

    public ClearOutputData(String deletionTime, boolean useCaseFailed) {
        this.deletionTime = deletionTime;
        this.useCaseFailed = useCaseFailed;
    }

    public String getDeletionTime() { return deletionTime; }

    public void setDeletionTime(String deletionTime) { this.deletionTime = deletionTime; }
}
