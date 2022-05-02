package com.javaex.ex06;

public class Ex03 {
	public static void main(String[] args) {
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(20);
		Short s = new Short((short)3);
		Byte b = new Byte((byte)3);
		
		//Integer iResult = i01 + i02;
		
		Integer iResult = new Integer(3) + new Integer(5);
		System.out.println(iResult);
		
		/*int no01 = 2;
		int no02 = 3;
		int noRewult = no01 + no02;*/
		
		Integer no = 3; //Interger no = new Integer 자동으로 만듬 - 박싱 
		
		int r01 = no.parseInt("1234"); //문자열 --> 정수로 변환 - 어색하다
		System.out.println(r01+1);
		
		int r02 = Integer.parseInt("12345"); //static 으로 올려서 사용한다 - 클래스 명
		
		Integer no2 = 100;
		int no3 = no2; //언박싱 - 자동으로 일어남
		
		//정수 --> 문자열
		//555 --> "555"'
		String str = "안녕하세요";
		String str02 = String.valueOf(555);
		System.out.println(str02); // 정수 --> 문자열
		
		//정수 --> 문자열
		String str03 = ""+555; //문자열+정수 -->문자열
		System.out.println();
		
		
	
	
	}
}
