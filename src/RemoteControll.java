import java.util.Arrays;

public class RemoteControll {
    private String[] names;
    private String[] models;

    public RemoteControll(String[] names, String[] models) {
        this.names = names;
        this.models = models;
    }

    public void pressTurnOnButton(Televisor televisor){
        televisor.turnOnOrOffByRemoteControl(this);
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String[] getModels() {
        return models;
    }

    public void setModels(String[] models) {
        this.models = models;
    }

    @Override
    public String toString() {
        return "names =" + Arrays.toString(names) +
                ", models =" + Arrays.toString(models);
    }
}
