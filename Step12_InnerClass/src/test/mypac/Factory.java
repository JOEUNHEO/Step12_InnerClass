package test.mypac;

public class Factory {
	//�͸��� inner class
	public Car car = new Car() {
		@Override
		public void drive() {
			System.out.println("���� ���� �޷���!");
		}
	};
	
	//��� �ʵ忡 �ִ� Car ��ü�� ����ϴ� �޼ҵ�
	public void useCar() {
		car.drive();
	}
	
	public Car getCar() {
		return car;
	}
}
