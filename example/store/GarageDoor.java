package example.store;

public class GarageDoor {

    private String roomName;

    public GarageDoor(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println(this.roomName + " GarageDoorOpen on");
    }

    public void down() {
        System.out.println(this.roomName + " GarageDoorOpen down");
    }

    public void stop() {
        System.out.println(this.roomName + " GarageDoorOpen stop");
    }

    public void lightOn() {
        System.out.println(this.roomName + " GarageDoorOpen light on");
    }

    public void lightOff() {
        System.out.println(this.roomName + " GarageDoorOpen light off");
    }
}
