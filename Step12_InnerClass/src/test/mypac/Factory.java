package test.mypac;

public class Factory {
	//익명의 inner class
	public Car car = new Car() {
		@Override
		public void drive() {
			System.out.println("졸라 빨리 달려요!");
		}
	};
	
	//멤버 필드에 있는 Car 객체를 사용하는 메소드
	public void useCar() {
		car.drive();
	}
	
	public Car getCar() {
		return car;
	}
}
