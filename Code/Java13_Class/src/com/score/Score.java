package com.score;

public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	//기본 생성자
	//파라미터 4개자리 생성자(초기화)
	public Score() {
		
	}	

	public Score(String name, int kor, int eng, int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	//모든 field에 대한 getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name; 
		//생성자에도 this.name이 잇는데 왜 또 쓰는 이유는 
		//>> 이름을 쓰려면 setNAme에 접근해야된다.위에 name변수는 private이라서 접근 불가능하다.
		
		//setName이 없고 getName만 있으면 읽고 쓰기만 가능, 수정은 불가능하다.
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math=math;
	}
	
	//모든field에 대한 총 합 리턴
	public int getSum() {
		int sum = kor+eng+math;
		return sum;
	}
	
	//모든 field에 대한 평균 리턴
	public double getAvg() {
		double avg =(double) getSum()/3;
		
		return avg;
		
	}
	
	//100-90 : A
	//89-80 : B
	//79-70 : C
	//69-60 : D
	//59-0 : F
	
	public String getGrade() {
	
		switch((int)getAvg()/10) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
		
		
	}
	
	//이름 : x 국어: x, 영어:x 수학:x
	//총점:x 평균:x 등급:x
	//로 리턴하자.
	public String toString() {
		return "이름: "+name+"   "+"국어: "+kor+"  "+"영어: "+eng+"  "+"수학: "+math+"\n"+
	"총점: "+getSum()+"  "+"평균: "+getAvg()+"  "+"등급: "+getGrade();
		
	}
	
	
}
