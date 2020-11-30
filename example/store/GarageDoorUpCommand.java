package example.store;

public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoorOpen) {
        this.garageDoor = garageDoorOpen;
    }

    public void execute() {
        garageDoor.on();
    }

    public void undo() {
        garageDoor.down();
    }
}
