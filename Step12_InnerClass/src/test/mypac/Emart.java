package test.mypac;

public class Emart {
	//����ʵ�
	public String branch = "��������";
		
	// ����� �ϴ� �޼ҵ�
	public void broadcast(String msg) {
		System.out.println(msg);
	}
	//û�Ҹ� �ϴ� �޼ҵ�
	public void clean() {
		System.out.println("û�Ҹ� �ؿ�");
	}
	//���� Ŭ����
	public class Worker{
		//���� Ŭ������ �޼ҵ�
		public void work() {
			broadcast("�������� ã���ϴ�.");
			clean();
			broadcast(branch);
		}
	}
}
