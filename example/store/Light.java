package example.store;

public class Light {

    private String roomName;

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println(this.roomName + "light on");
    }

    public void off() {
        System.out.println(this.roomName + "light off");
    }
}
