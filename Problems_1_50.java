package projectEuler;

public class Problems_1_50 {

	public static void problem1(){

		int sum = 0 ;	// 合計値

		for(int i=3; i<1000; i+=3)
			sum+=i ;
		for(int i=5; i<1000; i+=5)
			sum+=i ;
		for(int i=15; i<1000; i+=15)
			sum-=i ;

		System.out.println(sum);
	}


	public static void problem2(){

		int sum = 0 ;

		int a=1, b=2, c=3 ;
		//for(int i=0; i<4000000; i+=3)

		while(b<4000000){

			sum+=b ;

			a = b+c ;
			b = c+a ;
			c = a+b ;
		}
		System.out.println(sum);
	}

}
