package pro.sky.java.course_2_core.hw_2_3;

public class Truck extends Car {

    public Truck(String modelName, int wheelCount) {
        this.modelName = modelName;
        wheelsCount = wheelCount;
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }
}