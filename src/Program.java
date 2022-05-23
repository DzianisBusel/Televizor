public class Program {
    public static void main(String[] args) {

        OldTelevisor televisor1 = new OldTelevisor("Horizont", "1990");
        NewTelevisor televisor2 = new NewTelevisor("LG","2020");

        RemoteControll tvRemotes = new RemoteControll
                (new String[]{"Samsung", "LG", "Panasonic"},new String[]{"1990","2020", "2000"});

        RemoteControll tvRemote1 = new RemoteControll
                (new String[]{"Horizont"}, new String[]{"1990"});

       televisor1.turnOnOrOffByRemoteControl(tvRemotes);
       televisor2.turnOnOrOffByRemoteControl(tvRemote1);
    }
}
