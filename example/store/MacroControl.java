package example.store;

public class MacroControl {

    public static void main(String[] args) {
        RemoteControlWithUndo controlWithUndo = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");
        GarageDoor garageDoor = new GarageDoor("Living Room");

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        GarageDoorUpCommand doorUp = new GarageDoorUpCommand(garageDoor);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOff = new StereoOnWithCDCommand(stereo);
        GarageDoorDownCommand doorDown = new GarageDoorDownCommand(garageDoor);

        Command[] partyOn = { lightOn, stereoOn, doorUp };
        Command[] partyOff = { lightOff, stereoOff, doorDown };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        controlWithUndo.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(controlWithUndo);
        System.out.println("----- Pushing Macro On -------");
        controlWithUndo.onButtonWasPushed(0);
        System.out.println("----- Pushing Macro Off ------");
        controlWithUndo.offButtonWasPushed(0);

    }
}
