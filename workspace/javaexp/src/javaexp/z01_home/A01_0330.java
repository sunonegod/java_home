package javaexp.z01_home;

public class A01_0330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
0330
[1단계:개념] 1. Z01_JavaPro.java의 실행과정의 오늘한 예제 기준으로 정리해보세요.
[1단계:코드] 2. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
			  - 이름, 나이, 키 
			  - 좋아하는 음악명, 발매연도
			  - 오늘 지출금액 목록과 비용, 합산
[1단계:개념] 3. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
[1단계:개념] 4. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
[1단계:개념] 5. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
[1단계:개념] 6. 형변환이란 무엇인가 예제를 통해서 기술하세요.
[1단계:코드] 7. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
[1단계:개념] 8. char유형과 code값의 관계에 대하여 기술하세요.
[1단계:코드] 9. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
				
		*/
		// 1. Z01_JavaPro.java의 실행과정의 오늘한 예제 기준으로 정리해보세요.
		
		/**
		 1. Z01_JavaPro.java 소스코드를 만든다.
		 2. java Z01_JavaClass : 컴파일 파일을 만든다.
		 3. Z01_JavaClass.class : 생성
		 4. java Z01_JavaClass : main()이 있는 파일에서 메모리를 로딩시키고, 실행되는 처리를 한다.
		 */
		
		// 2. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
		String name="신혜원";
		int age = 23;
		int taller = 155;
		String song = "Creep";
		int year = 1992;
		int todayPay01 = 1550;
		int todayPay02 = 2200;
		
		System.out.println("이름: "+name + " 나이: " +age +" 키: "+taller);
		System.out.println("좋아하는 음악: "+song+ " 발매연도: "+year);
		System.out.println("오늘 지출금액 : "+"교통비 "+todayPay01+"원, " +"커피값 "+todayPay02+"원");
		System.out.println("합산 : "+(todayPay01+todayPay02)+"원");
		
		
		// 3. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
		int num01 = 65; //변수 선언, 값저장.
		System.out.println(num01); //메소드 호출, 실행문 끝에는 세미콜론(;)을 붙여야 한다.

		
		String $str01 = "Today Homework"; //특수문자는 $ 또는 _만 사용이 가능
		String test_homework = "Today Homework2";
		System.out.println($str01); 
		System.out.println(test_homework); 
		
		
		// 4. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
			//대소문자 구분, 같은 글자라도 대소문자 다르면 다른 변수로 인식(동일한 변수명으로 선언불가)
		int num02 = 90;
		// int num02 = 80; <= 동일한 변수 사용 불가능
		int Num02 = 190;
		num02 = 80; // 선언시 동일한 변수 사용 불가하지만 할당은 재할당 되므로 동일한 변수 사용 가능
		System.out.println(num02);
		System.out.println(Num02);
		
		
		// 5. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
		// 정수 : 
		//byte
		byte num05 = 123; //-128 ~ 127 사이에 있는 값을 사용할 수 있다.
		System.out.println(num05);
		
		// char
		char num06 =  9990; // 0~65535 영문문자를 나타낼 수 word단위, 각 코드값을 가지고 있다.
		System.out.println(num06);
		
		// short
		short num07 = 8889; // 2byte, 16bit
		System.out.println(num07);
		
		// int
		int num08 = 200000000; // -2147483648~2147483647 21억 까지 사용가능, 정수의 디폴트 데이터 유형
		System.out.println(num08);
		
		// long
		long num09 = 9999999999999l; // (8byte-64) int 유형의 범위를 넘어선 경우에는 L/l을 붙여서 long에 할당하여야 한다.
		System.out.println(num09);
		
		// 실수형 :
		// float
		float num10 = 10.9f; // 4byte,  float유형으로 선언하여 할당해야 하는 경우는 마지막에 f/F를 붙인다.
		System.out.println(num10);
		
		// double
		double num11 = 89.9; // 8byte, 실수의 디폴트 데이터 유형
		System.out.println(num11);
		
		// 논리형 : 
		//boolean
		boolean isExample01 = true;
		boolean isExample02 = false; 
		System.out.println(isExample01);
		System.out.println(isExample02);
		

		// 6. 형변환이란 무엇인가 예제를 통해서 기술하세요.
//		형변환 : 데이터 타입을 다른 타입으로 변환하는 것
		
		// 데이터 타입 끼리 변
		int num15 = 900000000;
		long num16 = 19000000000l;
		num16 = num15; // <= 데이터는 오른쪽에 의해서 왼쪽으로 할당된다.
					   // 작은 용기에 있는 데이터를 큰 용기에 있는 데이터로 할당할 떄는 자동적으로 형변환이 일어난다.
		
		// num15 = num16 <= 단, 큰 용기에 있는 데이터를 작은 용기에 있는 데이터로 할당할 때는 자동적으로 형변환이 일어나지 않기 때문에
		// 큰 용기를 작은 용기에 할당하려면 casting 작업이 필요하다.	
		
		num15 = (int)num16; // 해당 틀을 지정하여 처리한다.
		System.out.println(num16);
		System.out.println(num15);
		
//		정수 ==> 실수
		int num17 = 24;
		double num18 = num17;
		System.out.println(num18); // 정수에서 실수로 형변환을 할 떄는 묵시적 형변환
		
//		실수 ==> 정수
		double num19 = 98.9;
		int num20 = (int)num19; // 실수에서 정수로 형변환은 casting 작업을 해줘야 한다.
		System.out.println(num20);



		
		// 7. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
		 int money01 =2100000000;
	     int money02 =1500000000;             
//	     int tot02 = money01+money02;
//	     System.out.println("int합산:"+tot02); (X)
//	     long tot03 = (long)money01+money02;
	     System.out.println((long)money01+(long)money02);
		
		
		
		// 8. char유형과 code값의 관계에 대하여 기술하세요.
		// char는 각 code값을 가지고 있다. char에 의해 코드값으로 변환되었을 때 나타는 코드이다.
		// char문자는 숫자로 저장되어있다가 char에 의해 코드로 나타낸다.
		char code01 = 'B'; //''한자만 입력
		char[] code02 = {'A','r','a','g','o','n'}; //자바에선 {}를 통해 배열을 나타낸다.
		System.out.println(code01);  
		System.out.println(code02);

		
	
		// 9. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
		
		// 알파벳 대문자 코드값 범위 : 65~90
		for(int num12=65;num12<=90;num12++) {
			System.out.print(num12+":");
			System.out.println((char)num12);
		} 
		// 알파벳 소자 코드값 범위 : 97~122
		for(int num13=97;num13<=122;num13++) {
			System.out.print(num13+":");
			System.out.println((char)num13);
		} 
		// 숫자 코드값 범위 : 48~57
		for(int num14=48;num14<=57;num14++) {
			System.out.print(num14+":");
			System.out.println((char)num14);
		} 
				
		
	}

}
