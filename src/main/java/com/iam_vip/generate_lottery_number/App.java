package com.iam_vip.generate_lottery_number;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main( String[] args ) {
		
		for ( int i = 0; i < 100; ++ i )
			System.out.println( LotteryFactory.getLottery( "bicolor" ).generate() );
	}
	
}
