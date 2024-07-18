package behavioral.template_method.mytemplate;

abstract class Beverage {

    // Шаблонный метод
    public final void prepareRecipe() {
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

    // Хук-метод
    boolean customerWantsCondiments() {
        return true;
    }
}