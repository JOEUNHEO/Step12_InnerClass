package test.mypac;

public class Emart {
	//멤버필드
	public String branch = "종로지점";
		
	// 방송을 하는 메소드
	public void broadcast(String msg) {
		System.out.println(msg);
	}
	//청소를 하는 메소드
	public void clean() {
		System.out.println("청소를 해요");
	}
	//내부 클래스
	public class Worker{
		//내부 클래스의 메소드
		public void work() {
			broadcast("문지상을 찾습니다.");
			clean();
			broadcast(branch);
		}
	}
}
