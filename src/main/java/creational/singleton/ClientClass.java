package creational.singleton;

public class ClientClass {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        //в консоли видно что создан только 1 экземпляр
        singleton4.doSomething();
    }
}
