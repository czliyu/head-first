package example.proxy_rmi;

/**
 * 不希望整个糖果机都被序列化并随着State对象一起传送
 */
public class NoQuarterState implements State {

    /**
     * 对于State的每个实现 加上transient关键词，这样就JVM不要序列化这个字段
     */
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }
}
