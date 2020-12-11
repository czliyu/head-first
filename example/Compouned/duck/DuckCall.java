package example.Compouned.duck;

/**
 * 鸭鸣器
 */
public class DuckCall implements Quackable {

    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }
    
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}