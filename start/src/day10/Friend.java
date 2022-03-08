package day10;

/**
 * 	이 클래스는 친구 한 명의 데이터를 기억할 클래스
 * @author 김태현
 * @since 2022.03.08
 * @version v.1.0
 */

public class Friend {
	/*
	 	 이 클래스는 친구 한 명의 정보를 기억할 클래스이다.
	 	 이 클래스의 객체를 이용하면
	 	 여러명의 친구의 정보를 기억시켜둘 수 있다.
	 	 이 말은 친구의 정보는 변수에 기억시킬 것이고
	 	 각 친구마다 그 변수들의 데이터가 따로 입력되어서 기억되어야 하므로
	 	 따로 초기화는 필요하지 않다
	 	 
	 	 친구의 정보는
	 	 이 클래스를 객체로 만든후
	 	 변수의 내용을 변경시켜서 기억시키면 된다.
	 	 
	 	 이때 변수의 경우 아무나 이 객체의 변수에 접근해서 데이터를 변경시키면 안되므로
	 	 변수는 감춰두고 변수에 접근할 수 있는 함수들을 만들어서 데이터를 처리한다.
	 	 
	 */
	private String name, addr, tel, mail, birth;
	@Override
	public String toString() {
		return "Friend [name=" + name + ", addr=" + addr + ", tel=" + tel + ", mail=" + mail + ", birth=" + birth
				+ ", age=" + age + ", gen=" + gen + "]";
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	private int age;
	private char gen;	// 성별을 기억할 변수로 남자는 'M' 여자는 'F'
	
	// 이름을 기억시키는 함수
	public void setName(String name) {
		this.name = name;
		/*
		 * this. 현재 실행 중인 객체 자기 자신의 주소를 기억하는 변수.
		 */
	}
	// 기억된 이름을 반환해주는 함수
	public String getName() {
		return name;
	}
	// Source - generate getter and setter 사용하면 알아서 기억/반환 함수 생성해줌.
}
