# Start - 2022.02.22
2022.02.22 시작

# 이 곳은 김태현이 연습하는 장소입니다.

# *새 폴더와 이클립스 연동 시에 폰트와 인코딩 변경(utf-8)*
# Class 만들때 public static void main 체크하면 자동으로 입력되서 생성됨.
# 클래스 + 함수 많이 만들어보고 문제 풀어보기
# StarUML 논리처리 다이어그램 그리는 프로그램
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
