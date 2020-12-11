package example.Compouned.duck;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合模式允许我们像对待单个对象一样对待对象集合
 */
public class Flock implements Quackable {

    Observable observable;
    
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
