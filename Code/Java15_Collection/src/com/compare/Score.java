
package com.compare;

//클래스와 인터페이스 간의 확장이므로, implements 사용 (다중 상속 가능,다형성)
public class Score implements Comparable<Score>{
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	public Score() {
		
	}
	
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor=kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
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
	
	public int Sum() {
		int sum = kor+eng+math;
		return sum;
	}
	
	public double Avg() {
		double avg = Sum()/3;
		return avg;
	}
	public String Grade() {
		switch((int)Avg()/10) {
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
	@Override
	public String toString() {
		return "이름 : " + name + "\t 국어 : " + kor + "\t 영어 : " + eng + "\t 수학 : " + math + "\n"
				+"총합 : "+Sum()+"\t 평균 : "+Avg()+"\t 등급 : "+Grade();
	}

	@Override
	public int compareTo(Score o) { //compareTo는 comparable interface것 이다.
		// TODO Auto-generated method stub
		
		/*
		 * 1이면 앞의 인자가 더 큰 값
		 * 0이면 같은 값
		 * -1이면 뒤의 인자가 더 큰 값
		 */
		
		Score other = (Score)o;
		
		/*
		if(this.getKor() > other.getKor()) {
			return 1;
		}
		else if(this.getKor() < other.getKor()) {
			return -1;
		}
		else { //같으면
			return 0;
		}
		*/
		
		
		//return this.getName().compareTo(other.getName()); //이름 순으로 오름차순
		
		/*평균이 작은 것부터 큰것까지 정렬 (오름차순)
		 * 만일 평균이 같으면, 국어점수 큰것부터 작은 것으로 정렬(내림차순)
		 */
		if(this.Avg() > other.Avg()) {
			return 1;
		}
		else if(this.Avg() < other.Avg()) {
			return -1;
		}
		else {
			if(this.getKor() > other.getKor()) {
				return -1;
			}
			else if(this.getKor() < other.getKor()) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}
}
