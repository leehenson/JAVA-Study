class Car4 {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car4(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    Car4() {
        this("소나타", 2012, "검정색", 160);    // 다른 생성자를 호출함.
    }

    public String getModel() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}

public class ex_50 {
    public static void main(String[] args) {
        Car4 tcpCar = new Car4();
        System.out.println(tcpCar.getModel());
    }
}
