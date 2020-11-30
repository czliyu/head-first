package example.template;

/**
 * 钩子是一种被声明在抽象类中的方法，但只是空或者默认的实现。
 * 钩子的存在，可以让子类有能力对算法的不同点进行挂钩。要不要挂钩。
 */
public abstract class CaffeineBeverageWithHook {
    

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
