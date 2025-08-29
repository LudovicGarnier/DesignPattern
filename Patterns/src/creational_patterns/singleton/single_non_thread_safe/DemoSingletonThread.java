package creational_patterns.singleton.single_non_thread_safe;

public class DemoSingletonThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton singleton2 = Singleton.getInstance("BAR");
        System.out.println(singleton.value + " - " + singleton2.value);
    }
}
