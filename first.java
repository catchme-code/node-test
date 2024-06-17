package Day3;

import java.util.Random;


public class first {

	public static void main(String[] args) {
	Random ran=new Random();
	
	int a= ran.nextInt(6)+1;
	int b= ran.nextInt(6)+1;
	int c= (a+b)/2;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	

	}

}
