package example.Compouned.duck;

/**
 * 鸭子装饰器 装饰大鹅
 */
public class GooseAdapter implements Quackable {
    
    Goose goose;
    Observable observable;

    public GooseAdapter() {
        observable = new Observable(this);
    }

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
