package example.Compouned.duck;

public class Quackologist implements Observer {
    
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + "just quacked.");
    }
}
