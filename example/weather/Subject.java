package example.weather;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    // 当主题状态发生改变后，这个方法会通知所有观察者
    public void notifyObservers();
}