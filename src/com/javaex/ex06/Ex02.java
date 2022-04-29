package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//concat 더하기역할 - 기호로도 대체가능
		//System.out.println(a.concat(b));
		//System.out.println(a+b);
		
		a = a.concat(b);
		System.out.println(a);
		
		//trim 앞뒤의 공백제거 역할 - 중간 공백은 안됨
		a = a.trim(); 
		System.out.println(a.trim());
		System.out.println("__"+a);
		
		//replace 문장 변경 - 자리수 상관없이 바뀜(자리수2, 2 == 2, 5)no상관
		a = a.replace("ab", "12");
		System.out.println(a);
		
		System.out.println("================================");
		//split 배열로 짤라준다 기준하나 잡아 모든기준은 사라짐
		String[] sArray = a.split(",");
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println(a);
		
		System.out.println("================================");
		
		//substring 입력 숫자에서부터 짤라서 가져옴 
		String str = "Hello java!";
		String result01 = str.substring(3); //3부터
		System.out.println(result01);
		
		String result02 = str.substring(1, 7); //1부터~7번 전까지
		System.out.println(result02);
		
		//charAt 지정번호때의 문자 출력
		char result03 = str.charAt(8);
		System.out.println(result03);
	}
}
