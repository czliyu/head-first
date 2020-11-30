package example.store;

public class StereoOnWithCDCommand implements Command {
    
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo streco) {
        this.stereo = streco;
    }

    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    public void undo() {
        stereo.off();
    }
}
