package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {

    private String clearedUsernames;

    public ClearState(ClearState copy) {
        clearedUsernames = copy.clearedUsernames;
    }
    public ClearState() {}

    public String getClearedUsernames() {
        return clearedUsernames;
    }

    public void setClearedUsernames(String response) {
        clearedUsernames = response;
    }



}
