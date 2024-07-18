package behavioral.template_method.mytemplate;

class Coffee extends Beverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    // Переопределение хук-метода
    @Override
    boolean customerWantsCondiments() {
        return true; // или можно добавить логику запроса у пользователя
    }
}
