package example.store;

public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        this.garageDoor.down();
    }

    public void undo() {
        this.garageDoor.on();
    }
}
