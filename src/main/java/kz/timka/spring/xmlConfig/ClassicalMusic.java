package kz.timka.spring.xmlConfig;

public class ClassicalMusic implements Music {

    private ClassicalMusic () {

    }

    public static ClassicalMusic getInstance() { // factory-method
        System.out.println("factory-method");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("doing my initialization before bean will be ready");
    }
    @Override
    public String getSong() {
        return "Classical music";
    }

    public void doMyDestroy() {
        System.out.println("doing my destruction");
    }
}
