class Person{
	
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{	//Student는 person을 상속받음
	
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		// weight = 99;	프라이빗으로 선언해서 접근 안됨
		setWeight(99);	//메소드를 통해 접근
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.set();
		
		//내가 임의로 추가
		System.out.println("나이는 " + s.age);
		System.out.println("이름은 " + s.name);
		System.out.println("키는 " + s.height);
		System.out.println("몸무게는 " + s.getWeight());
	}

}
