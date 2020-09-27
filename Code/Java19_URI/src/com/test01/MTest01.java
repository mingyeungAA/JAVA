package com.test01;
import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {
	public static void main(String[] args) throws URISyntaxException {
		URI uri = new URI("http://localhost:8787/Java19_URI_Web/res.jsp?myname=%EB%B0%B0%EB%AF%BC%EA%B2%BD&myaddr=%EC%84%9C%EC%9A%B8%EC%8B%9C+%EB%85%B8%EC%9B%90%EA%B5%AC");
		System.out.println(uri.getScheme()); //어떻게 요청하고 있냐
		System.out.println(uri.getHost()); //local host or ip
		System.out.println(uri.getPort());
		System.out.println(uri.getPath());
		System.out.println(uri.getQuery()); //데이터 보내고 받는 것을 의미
	}
}

/*
 * java.net : URL, Address, UDP, TCP ...
 * 
 * 1. URI : (Uniform Resource Identifier) 식별자
 * 
 * 2. URL : (Uniform Resource Locator) 주소(위치)
 * 
 * 3. URN : (Uniform Resource Name) 대상(이름)
 * 
 * URI = URL + URN
 * 
 * 
 * Rest(ful)Api >> 해당 자원을 요청하면 그 자원을 받아주겠다.
 * 
 * 
 */
