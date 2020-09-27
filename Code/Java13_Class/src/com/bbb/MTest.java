package com.bbb;

import com.aaa.AAA;

public class MTest {
	public static void main(String[] args) {
		
		AAA aaa=new AAA(); //new 뒤의 AAA()부분을 생성자 라고 한다. >> AAA의 기본생성자가 출력됨
		aaa.prn();
		AAA aaa01 = new AAA(100);
		System.out.println(aaa.getAbc()); //0이 출력됨 >> 파라미터가 없는 생성자를 출력해서
		System.out.println(aaa01.getAbc()); //100이 출력됨 >> 파라미터에 100을 넣어서
		
		System.out.println("---------------------");
		
		//부모객체가 잇어야지 자식객체를 만들 수 있다.
		//BBB만 만들었지만 부모가 잇어야지만 BBB가 만들어지기때문에 부모도 호출된다.
		//부모의 주소값을 가지고 잇음
		BBB b01 = new BBB(); //AAA의 기본생성자가 출력되고 그다음, BBB의 기본생성자가 출력된다.
		b01.setAbc(10);  //부모클래스 AAA의 인스턴스 변수 abc에 값을 대입
		b01.setB(20);
		System.out.println(b01.getSum());
		
		
		System.out.println("-------------------");
		BBB b02 = new BBB(30);
		b02.setAbc(40);
		System.out.println(b02.getSum());
		
		System.out.println("-------------------");
		
		BBB b03 = new BBB(50,60);
		System.out.println(b03.getSum());
		
		System.out.println("=====================");
		AAA a1 = new AAA();
		AAA a2 = new BBB();  //부모타입으로 자식객체를 담을 수 있다. >> AAA를 상속받은 BBB이다....(현실은 BBB이다)
		//AAA가 가지고 있는 메소드만 호출할 수 있다.
		//a2.getB(); //AAA가 가지고 잇는 메소드가 아니므로 호출 불가능
		System.out.println("---");
		a1.prn();
		a2.prn();
		
		System.out.println("-----------------");
		//BBB b1 = new AAA();  //불가능!! >> 자식타입이 부모객체를 담을 수 없다.
	}
}

/*
<생성자>
1. 클래스 이름과 동일하되, 리턴타입은 없고, 객체 생성시 접근 제한자는 public

class Test{
	public Test(){ //생성자
	
	}
}

2. 생성자는 객체 생성을 하는 new 연산자와 함깨 사용되며, 생성시 단 한번만 자동 호출된다.
Test t1 = new Test();  // (o) -> 기본 생성자 호출

3. 생성자는 메소드처럼 객체 및 클래스명으로 호출할 수 없다.
t1.Test();             // (x) 
Test.Test();           // (x)

4. overload 할 수 있다.
class Test{
	public Test(){             //기본생성자(default constructor)
	}
	public Test(int a){
	}
	public Test(int a, int b){
	}
	...
}

5. 생성자를 명시하지 않으면 기본 생성자가 제공되어 field를 초기화 하고, 생성자를 ㅁ여시하면 명시한 생성자만 호출되고, 기본생성자는 제공되지 않는다.
class AA{  //AA a=new AA();  (o)
}

class BB{
	public BB(){   // BB b=new BB();  (o)
	}
} 

class CC{
	public CC(int a){  // CC c = new CC();  (x)
	}                  // CC c= new CC(10);   (o)
}

6. 생성자는 상속되지 않는다.

7. 생성자는 내부 호출할 수 있다.
this();

8. 생성자의 목적 : 객체 생성, 필드 초기화



*/