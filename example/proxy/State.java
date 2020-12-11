package example.proxy;


public abstract class State {

    void insertQuarter() {
        System.out.println("Please wait, we're already giving you a qumball");
    }
    
    void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumabll!");
    }

    void dispense() {
        System.out.println("No gumball dispensed");
    }
    
}
