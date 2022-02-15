class Car1 {
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;
	
	Car1(String modelName, int modelYear, String color, int maxSpeed) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
	}
	
	public String getModel() {
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}
}

public class ex_47 {
	public static void main(String[] args) {
		Car1 myCar = new Car1("아반떼", 2016, "흰색", 200);	// 생성자의 호출
		System.out.println(myCar.getModel());	// 생성자에 의해 초기화되었는지를 확인함.
	}
}