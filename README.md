<pre>
# Start - 2022.02.22
2022.02.22 시작

# 이 곳은 김태현이 연습하는 장소입니다.

# *새 폴더와 이클립스 연동 시에 폰트와 인코딩 변경(utf-8)*
# Class 만들때 public static void main 체크하면 자동으로 입력되서 생성됨.
# 클래스 + 함수 많이 만들어보고 문제 풀어보기
# StarUML 논리처리 다이어그램 그리는 프로그램
# 트랜잭션 : "일을 처리하는 단위" 
# 프로그램 버전 : major.minor.micro
# JDBC 사용법
  - MVN Repository<br>
  	1. Ojdbc6 검색
	2. 버젼 클릭
	3. files의 jar 다운
	4. 편한 경로에 저장
	5. 프로젝트 우클릭 -> Properties
	6. Java Build Path -> Libraries 탭 -> Add External JARs -> Ojdbc6들고오기
	7. 적용
# 깃허브 사용법
  - 깃리포지터리에 업로드하는 법<br>  		
	깃에서 리포지터리 생성 -> 토큰 코드 저장<br>
  	프로젝트 선택 - team - commit -> 하단에 Git Staging 나타남 -> 커밋하려는 파일 선택(가독성을 위해 트리 구조로 변경, 필요없는 파일 무시 -> 실제 소스코드만 남기고 프로젝트 클릭) "+"버튼 클릭 -> Commit Message 입력 ->commit and push <br>    
<p></p>

  - 깃허브에서 다운로드 하는 법 <br>
	  새 폴더로 만들어서 이클립스와 연결 (프로젝트명 충돌 우려) -> Window -> Show View -> other -> Git Repositories -> 자기 깃허브의 레포지터리 주소 연결 -> 토큰 코드 입력(저장되어 있으면 생략) -> 레포용 폴더에 다운 -> 좌측 하단의 git repositories의 working tree -> 필요한 프로그램 우클릭 -> Import Projects 하면 이클립스에 올라온다.<br>
	<p></p>
	
  - 수정된 소스코드를 연동된 리포지터리와 동기화(pull)<br>
 	 수정한 프로젝트 우클릭 -> Team -> Pull<br>
  <p></p>
  
  Commit - 로컬 레포지터리에 저장 <br>
  Push - 새로운 소스코드나 패키지 서버에 업로드<br>
  Pull - 수정된 소스코드 서버에 업로드<br>
  <p></p>
  
  패키지에 하위 패키지 넣는 법 해당 패키지에서 new -> package -> 상위패키지이름.ex <br>

# Java

# Day01
  JDK 및 이클립스 설치 등 개발환경 조성 (D2coding 폰트, utf-8 인코딩 설정)<br>
  패키지, 클래스, 자료형, 4가지 메모리 영역(스택, 힙, 리터럴 풀, 스태틱)<br>
  
# Day02
  깃허브 연동 - 레포지터리 저장 방법  - 상단에 위치<br>
  멤버, 필드, static멤버<br>
  상수와 변수<br>
  형변환 (리터럴 형변환, 자동 형변환, 강제 형변환)<br>
  자바 프로그램의 토큰(;, {})<br>
  주석 (단일행, 다중행, 배포문서에 포함되는 주석)<br>
  
# Day03
  깃허브 레포터리 다운로드(Import projects, Pull) - 상단에 위치<br>
  연산자 및 그 종류<br>
  사용자에게 입력받기(import java.util.*; Scanner sc = new Scanner(System.in);)<br>
  문자열 데이터 비교시 문자열.equals(비교할 문자열) 사용해서 비교하기<br>
  
# Day04
  3일차 연산자 남은 부분 (Day03에 필기)<br>
  import시 중복된 클래스 적용 우선 순위 (\*보단 직접 명시한 것 부터)<br>
  특정 범위 랜덤한 숫자 발생시키는 방법 (Math.random())<br>
  문자열에서 문자 추출하는 법 (.charAt(n))

# Day05
  이스케이프 코드<br>
  조건문(if문, switch문 <- break확인 제대로 하기)<br>
  반복문(for문, 향상된 for문 <- 배열사용, while문)<br>
  배열<br>
  
# Day06
  반복문 추가설명<br>
  flag 기법<br>
  레이블 있는 반복문<br>
  전역/지역 변수<br>

# Day07
  배열<br>
  Heap메모리영역<br>
  자바 변수의 형태(기본형/ 참조형)<br>

# Day08
  배열 복사(얕은/깊은 복사) 및 단점<br>
  String형 배열 및 사용 함수<br>
  이차원 배열<br>

# Day09
  함수<br>
  **함수의 오버로딩**<br>
  0. 해당 클래스에 오버로딩하려는 함수가 있어야한다.
  1. 함수의 이름이 같아야 한다.
  2. 매개변수의 갯수, 순서, 형태 중 하나 이상이 달라야 한다.
  3. 반환값은 상관없다.<br>
  객체지향 OOP<br>
 
# Day10
  객체지향언어<br>
  상속<br>
  생성자함수<br>
  ***this()***<br>
  ctrl + f로 relpace하기<br>
  Friend[] ane = new Friend[4]; 는 null값으로 주소 공간만 제공<br>
  for문+ ane[i] = new Friend();로 각 방에 데이터 채워야함<br>
  가변인자<br>

# Day11
  ***상속***(객체지향언어 특징)<br>
  함수의 오버라이딩(함수 재정의)<br>
  import와 package(+ static, final import)<br>
  
# Day12
  다형성
  <p>- 하위 클래스의 인스턴스(new한, 메모리에 올라간 변수)는 상위 클래스들의 레퍼런스(주소 기억 변수)로 사용할 수 있다.</p>
 ㄴ 추상 함수 + 추상 클래스<br>
 ㄴ 인터페이스<br>
 내부클래스<br>
 
  1. Top Level
  2. 전역
  3. 내부
  4. 무명<br>

# Day13
 예외처리 및 강제예외처리(예외던지기)<br>
 
# Day14
 java.util패키지 소속의 유용한 클래스<br>
 1. isNull(Object obj)<br>
 2. ..<br>
 Object클래스<br>
 - equals() 오버라이드<br>
 - toString() 오버라이드<br>
 - clone()<br>
 - hashCode()<br>
 String 클래스<br>
 - StringBuffer<br>
 - StringTokenizer<br>
 Math클래스 - 모두 static멤버라 new 사용 X<br>
 Wrapper class(래퍼클래스) - 기본데이터타입을 객체화 시키는 Boxing을 위함<br>

# Day15
 Random클래스, BigDecimal클래스<br>
 정규식검사(java.util.Pattern, java.util.Macher 사옹 -> 입력마스크)<br>
 컬렉션 (컬렉션에 컬렉션 저장 가능)<br>
 1. List계열 (입력순서 보장, 중복 데이터 저장 가능)<br>
	- Vector : 배열 형태로 저장하는 컬렉션의 일종 / 데이터 변화가 거의 없는 프로그램에 많이 사용<br>
	- ArrayList : Vector + 자동 동기화<br>
	- LinkedList : 데이터 중간에 넣기, 삭제 빠름 / 데이터 누적 느림<br>
	+@ Iterator클래스 - 데이터 꺼내기 위해 사용하는 클래스, Collections클래스 - 콜렉션의 유틸리티적 클래스<br>
 2. Set계열(순서 보장X, 중복 저장X) + 데이터 꺼내는 함수 존재X Iterator/List형 변환 이후 추출<br>
	- HashSet : HashCode를 이용해 정렬 -> equals(), hashCode() 오버라이드로 객체 중복 지시 가능<br>
	- TreeSet : TreeSort라는 알고리즘을 이용한 컬렉션의 일종 -> 입력되는 데이터는 항상 정렬가능한 데이터이어야 한다.<br>
	+ 그렇기 때문에 TreeSet을 만들 때<br>
	(1). 정렬 방식을 알려주는 Comparator을 이용하는 방법<br>
	(2). 정렬 가능한 클래스로 미리 만드는 Comparable인터페이스를 구현한 클래스 작성하는 방법 등을 사용한다.<br>
	+@ subSet()함수, headSet(E toElement)함수, tailSet(E fromElement)<br>

# Day16
 3. Map계열 (키 : 데이터) <- 데이터를 손쉽게 구분할 목적<br>
 	- TreeMap : TreeSet과 같이 내부에서 정렬하면서 데이터를 기억하는 Map<br>
 	- HashMap : 키값만 꺼내는 함수가 keySet();임<br>
 	- entrySet() : 하나만 저장이 되는 Set에 키와 값을 하나로 묶어 저장해주는 함수 = <br>
 	- Value Object(VO클래스) : 빈클래스 -> 기능이 없고 데이터를 하나로 묶어주는 클래스
 	- Properties : Map의 역할을 하는 클래스 (cmd창에서 인코딩 필요) <br>
 4. 제너릭스 : 컬렉션에서 꺼낼 때는 강제 형변환 해줘야 하는 것을 미리 해주는 것<br>
 5. 이노테이션 : 내부적으로 약속된 실행을 자동으로 처리하도록 하는 명령의 일종 ex) @Override<br>
 
# Day17
Stream : 외부 장치와 데이터를 주고 받는 방법<br>
import.java.io.* 패키지<br>
	- 방향성이 있고 단방향이다. = 주고 받으려면 2개가 필요하다<br>
	- 종류<br>
		1) 방향성<br>
			(1). 프로그램에서 데이터가 들어오는 방향 = InputStream, Readere <br>
				- int read()	= 1byte 읽기<br>
				- int read(byte[] b)	= b배열에 기억하고 반환값 데이터 개수<br>
				- int read(byte[] b, int offset, int len)	= offset(시작위치), len(읽을 개수)<br>
			(2). 프로그램에서 데이터가 나가는 방향 = OutputStream, Writer <br>
				- void write() 위와 동일<br>
		2) 데이터의 양<br>
			(1). byte단위(뒤에 Stream) = InputStream, OutputStream : 기계어 처리 가능<br>
			(2). char단위(뒤에 Reader, Writer) = Reader, Writer : 문자처리만 가능<br>
		3) 상대방 종류
			(1). 타겟 스트림(기본스트림) = 필수<br>
			(2). 필터 스트림(보조스트림) = 선택적 / 속도향상or개발자 편의 / 반드시 같은 방향 같은 크기만 연결 가능(바-바 문-문)<br>
				- BufferedInput/OutputStream : 성능 향상 + .flush() 버퍼 지우기 필요<br>
				- DataInput/OutputStream : 자바 데이터형 유지 가능 but 순서 지켜야해서 귀찮음<br>
				- PrintStream/PrintWriter : 내부적으로 Buffered와 연결, 자바 데이터형 그대로 출력 가능, 파일과 직접 연결 = 타겟스트림 내부에서 생성 / .flsuh() 필요 + 입력X<br>
객체의 직렬화<br>
- 클래스 전체를 데이터로 상대방(외부장치)에 입출력 가능 = 네트워크 같이 서로 떨어진 경우 양쪽 다 같은 패키지이름+클래스이름이 존재 해야함<br>
- Serialzable 인터페이스를 구현한 클래스만 가능<br>
- 크기가 다른(byte / char) 스트림을 연결할때 사용하는 보조보조 스트림 InputStreamReader / OutputStreamWriter + 기본스트림 + 보조스트림(다른 크기)와 함께 사용<br>

# Day18
Thread(스레드)<br>
	public 스레드명 extends Thread / implements Runnable{
		@Override
		public void run(){
		}
	}
- 독립적인 메모리를 할당받지 못하고 프로세스 프로그램의 메모리를 공유한다.(반드시 프로세스가 실행된 상태여야한다.)<br>
- 스레드 프로그램 동작하는 법<br>
	1) Thread 상속<br>
		(1) new 시킨다.	->	New Born 상태가 된다.
		(2) start 시킨다.	->	Runnable 상태로 전위시킨다.
	2) Runnable 인터페이스를 구현한 경우<br>
		(1) new 시킨다.	->	일반적인 new를 통한 메모리 할당(일반 클래스를 사용하기 위한 객체 지향 방법)
		(2) Thread t1 = new Thread((1)의 결과);	-> New Born상태가 된다.
		(3) t1.start();	-> Runnable 상태로 전위된다.<br>
- 하나의 스레드 프로그램은 여러 번 실행할 수 있고 독립적으로 실행된다.<br>
- Block상태로 전위하기 (실행을 잠시 중단하는 상태) : 스레드.sleep(밀리세컨); 시간 지나면 자동으로 Runnable 전위<br>
- 스레드가 있는 프로그램의 경우 main()과 스레드 모두 종료되어야 프로그램이 종료된다.<br>
	1) stop(); 사용금지명령이다. = run()을 자연스럽게 종료시켜야 한다.
	2) run()함수에 제어변수를 이용해서 처리하자.
* 일시중지 - suspend() / 재실행하기 - resume()<br>

# Day20 - Oracle시작
주석 /* */이랑 --(sqldeveloper에서만 가능한 주석)<br>
질의 명령 : 데이터에 관한 질의<br>
오라클에만 PL/SQL기능 존재<br>
실행은 ctrl+enter<br>
데이터만 대소문자 구별 테이블명, 컬럼이름 등을 쓸때 대소문자 구별 X<br>
문자나 문자열 모두 ''로 묶음<br>
명령 종류<br>
  1. DML명령<br>
  	- Database Manipulation Language (데이터 조작 언어)<br>
	= 데이터를 추가, 수정, 삭제, 조회하는 작업을 하는 명령<br>
		Create	- INSERT
		Read	- SELECT
		Update	- UPDATE
		Delete	- DELETE<br>
  2. DDL명령<br>
  	- Data Definition Language (데이터 정의 언어)<br>
	= 개체를 만들고 수정하는 언어<br>
		CREATE	- 개체(테이블, 사용자, 함수, 인덱스,..)를 만들 때 사용하는 명령
		ALTER	- 개체를 수정하는 명령
		DROP	- 개체를 삭제하는 명령
		TRUNCATE - 테이블을 잘라내는 명령<br>
  3. DCL명령<br>
  	- Data Control Language (데이터 제어 언어)<br>
	= 작업을 적용시킨다던지 권한을 준다던지<br>
		COMMIT
		ROLLBACK
		<br>
		GRANT
		REVOKE<br>
오라클 데이터 타입<br>
	1. 숫자 NUMBER, NUMBER(숫자) -> 숫자는 사용자릿수
		NUMBER(유효자릿수, 소수이하자릿수)<br>
	2. 문자 CHAR -> 고정 문자수 문자열 데이터타입
			CHAR(숫자) -> 바이트수만큼의 문자 기억
			CHAR(숫자 CHAR) -> 숫자갯수만큼의 문자 기억
		VARCHAR2 -> 가변 문자수 문자열 데이터타입
			 VARCHAR2(숫자) -> 숫자수만큼의 바이트만큼 문자 기억
			 VARCHAR2(숫자, CHAR) -> 숫자갯수만큼의 문자를 기억<br>
		ex) CHAR(10) -> 'A' -> 이 문자를 기억할 때 10바이트를 모두 사용
		    VARCHAR2(10) -> 'A' -> 1바이트로 문자 기억<br>
	3. 날짜

# html
2020-06 (4.16) 클릭
Enterprise Java Developers 설치
Static web project	: 이미 만드렁진 문서를 서버가 제공하는 프로젝트
Dynamic web project	: 요청 내용에 따라서 그때그때 서버가 문서를 만들어서 제공하는 프로젝트
</pre>
