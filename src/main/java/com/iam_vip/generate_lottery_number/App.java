package com.iam_vip.generate_lottery_number;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main( String[] args ) throws IOException {
		
		File f = new File( "E:\\tmp\\bicolor.txt" );
		
		BufferedWriter writer = new BufferedWriter( new FileWriter( f ) );
		
		for ( int i = 0; i < 10000; ++ i ) {
			String line = LotteryFactory.getLottery( "bicolor" ).generate();
			System.out.println( line );
			writer.write( line );
			writer.write( "\r\n" );
		}
		
		writer.close();
	}
	
}
