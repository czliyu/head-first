package example.store;

public class Stereo {

    private String roomName;

    public Stereo(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println(this.roomName + "Stereo on");
    }

    public void off() {
        System.out.println(this.roomName + "Stereo off");
    }

    public void setCd() {
        System.out.println(this.roomName + "Stereo set CD");
    }

    public void setDvd() {
        System.out.println(this.roomName + "Stereo set dvd");
    }

    public void setRadio() {
        System.out.println(this.roomName + "Stereo set radio");
    }

    public void setVolume(int vol) {
        System.out.println(this.roomName + "Stereo set volume " + vol);
    }

}
