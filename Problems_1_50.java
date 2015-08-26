package projectEuler;

import java.math.BigInteger;

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


	public static void problem3(){

		Double limit_D = new Double("600851475143") ;
		BigInteger num = new BigInteger("600851475143") ;
		int limit = (int)Math.sqrt(limit_D.doubleValue()) ;

		int max_factor = 1 ;

		for(int i=2; i<limit; i++){

			boolean isPrimeNumber = true ;
			for(int j=2; j<i; j++){
				if(i%j==0)
					isPrimeNumber = false ;
			}
			if(isPrimeNumber==false)
				continue ;

			if( num.remainder(BigInteger.valueOf(i))==BigInteger.valueOf(0) ){
				max_factor = i ;
				System.out.println(i);
			}
		}

		System.out.println(max_factor) ;

	}

}
