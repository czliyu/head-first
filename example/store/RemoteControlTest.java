package example.store;

public class RemoteControlTest {

    public static void main(String[] args) {

        // 遥控器就是调用者，会传入一个命令对象，可以用来发出请求
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // 创建一个电灯对象，此对象也就是请求的接收者
        Light light = new Light("living room");
        LightOnCommand lightOn = new LightOnCommand(light);

        // GarageDoorOpen
        GarageDoor garageDoorOpen = new GarageDoor("Living Room");
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoorOpen);

        // 把命令传给调用者
        remote.setCommand(lightOn);
        // 模拟按下按钮
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
    
}
