public class NewTelevisor implements Televisor {

    private String name;
    private String model;
    private Boolean turnedOn;

    public NewTelevisor(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void turnOn() {
        if (!turnedOn) {
            turnedOn = true;
            System.out.println("Появилась заставка");
            System.out.println("Телевизор " + name + " включён");
        }
        else {
            System.out.println("Телевизор " + name + " уже включён");
        }
    }

    @Override
    public void turnOf() {
        if (turnedOn){
            turnedOn = false;
            System.out.println("Появилась заставка");
            System.out.println("Экран погас...");
            System.out.println("Телевизор " + name + " выключен");
        }
        else {
            System.out.println("Телевизор " + name + " уже выключен");
        }
    }

    @Override
    public void turnOnOrOffByRemoteControl(RemoteControll remoteControll) {
        if (isRemoteControlEnabledToUseWithTv(remoteControll)){
            if (turnedOn){
                turnOf();
            }
            else {
                turnOn();
            }
        }
    }
    private boolean isRemoteControlEnabledToUseWithTv(RemoteControll remoteControl){
        boolean bName = false;
        boolean bModel = false;
        for (int i = 0; i < remoteControl.getNames().length; i++){
            if (remoteControl.getNames()[i].equals(name)){
                bName = true;
                break;
            }
        }
        for (int i = 0; i < remoteControl.getModels().length; i++){
            if (remoteControl.getModels()[i].equals(model)){
                bModel = true;
                break;
            }
        }
        if (bModel && bName){
            return true;
        }
        else {
            System.out.println("Пульт(ы) " + remoteControl + " не подходит(ят) " +
                    "к телевизору " + name);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
