package com.test01;

public class MTest {
	
	private static String str = "The String class represents character strings.";
	
	public static void main(String[] args) {
		/*
		String s = "Hello";
		System.out.println(s+1+2);  //문자열이 아닌 것이 문자열을 만나면 문자열이 된다.
		
		System.out.println(s);
		s=s+1+2;
		System.out.println(s);
		*/
		
		
		//1. str의 전체 길이를 출력하자.
		prn01();
		//2. str 전체를 대문자로 바꿔서 출력하자.
		prn02();
		//3. str 전체를 소문자로 바꿔서
		prn03();
		//4. str에서 첫번째 c의 인덱스 위치를 출력
		prn04();
		//5. "class"단어를 "java"로 바꿔서 출력
		prn05();
		//6. "character"를 찾아서 대문자로 변경후,
		//   변경된 str 전체 출력
		prn06();
		//7.str을 char[]로 출력하되, 'c'만 출력하자.
		//  그리고 'c'의 갯수를 출력하자.
		prn07();
		//8.str을 char[]로 출력하되, 대문자만 출력하자.
		//   그리고 대문자의 갯수를 출력하자.
		prn08();
		//9. 공백 제거후 출력하자.
		prn09();
		//10. 전체를 역순으로 출력하자.
		prn10();
		
		
	}
	private static void prn10() {
		// TODO Auto-generated method stub
		System.out.println("---------------------10---------------------");
		char[] str2 = str.toCharArray();
		
		for(int i=str2.length-1 ; i>=0 ; i--) {
			System.out.print(str2[i]);
		}
	}
	private static void prn09() {
		// TODO Auto-generated method stub
		System.out.println("---------------------09---------------------");
		System.out.println(str.replaceAll(" ",""));
		//System.out.println(str.trim());  //맨 앞이랑 맨 뒤의 공백만 제거해줌.
		//System.out.println(str.replaceAll(regex, replacement)); //정규표현식 //regex : 바꿔줄 애 , replacement : 이것으로 바꿔줄거야
		
	}
	private static void prn08() { //str을 char[]로 출력하되, 대문자만 출력하자. 그리고 대문자의 갯수를 출력
		// TODO Auto-generated method stub
		System.out.println("---------------------08---------------------");
		char[] str2 = str.toCharArray();
		int cnt=0;
		
		for(int i=0 ; i<str2.length ; i++) {
			if((str2[i] >= 'A') && (str2[i] <= 'Z')) { //아스키코드 때문에 가능함. (65~90)
				System.out.print(str2[i]);
				cnt++;
			}
		}
		/*
		for(int i=0 ; i<str2.length ; i++) {
			if(Character.isUpperCase(str2[i])) {
				System.out.println(str2[i]);
				cnt++;
			}
		}
		*/
		
		System.out.println();
		System.out.println("대문자의 갯수는 "+cnt);
		
	}
	private static void prn07() { //str을 char[]로 출력하되, 'c'만 출력하자. 그리고 'c'의 갯수를 출력하자.
		// TODO Auto-generated method stub
		System.out.println("---------------------07---------------------");
		char[] str2 = str.toCharArray();
		int count=0;
		for(int i=0 ; i<str2.length ; i++) {
			if(str2[i]=='c' || str2[i]=='C') {
				System.out.println(str2[i]);
				count++;
			}
		}
		System.out.println("c의 갯수는 "+count);
	}
	private static void prn06() { //"character"를 찾아서 대문자로 변경후, 변경된 str을 출력
		// TODO Auto-generated method stub
		System.out.println("---------------------06---------------------");
		//System.out.println(str.replace("character","CHARACTER"));
		
		String target = "character";
		int startIdx = str.indexOf(target);  //character의 첫 시작 위치
		int endIdx = startIdx + target.length(); //character의 마지막 위치
		String upper = str.substring(startIdx, endIdx).toUpperCase();  //substring : 시작위치부터 끝위치까지만 출력(잘라내기) >> character만 잘라서 대문자로 바꿔줬음.
		System.out.println(str.replace(target, upper));
	}
	private static void prn05() {
		// TODO Auto-generated method stub
		System.out.println("---------------------05---------------------");
		System.out.println(str.replace("class","java"));
	}
	private static void prn04() {
		// TODO Auto-generated method stub
		System.out.println("---------------------04---------------------");
		System.out.println(str.indexOf('c')); //묵시적형변환 일어남. 아스키코드 때문에 변환됨.
	}
	private static void prn03() {
		// TODO Auto-generated method stub
		System.out.println("---------------------03---------------------");
		System.out.println(str.toLowerCase());
	}
	private static void prn02() {
		// TODO Auto-generated method stub
		System.out.println("---------------------02---------------------");
		System.out.println(str.toUpperCase());
	}
	private static void prn01() {
		System.out.println("---------------------01---------------------");
		System.out.println(str.length());
	}

}
