package kalkulator;

import java.util.Scanner;

public class Kalkulator {
	public static void main(String[] args)
	{
		String odp;
		do
		{
		Scanner in=new Scanner(System.in);
		System.out.println("Podaj liczb� a");
		int a=in.nextInt();
		System.out.println("Podaj liczb� b");
		int b=in.nextInt();
		System.out.println("Wybierz dzia�anie(d) dodawanie, (o) odejmowanie, (dz) dzielenie, (m) mno�enie");
		Scanner ww=new Scanner(System.in);
		String ee=ww.nextLine();
	    if (ee.equals("d")) {
	    	System.out.println("Suma liczb to " +(a+b));
		} else if (ee.equals("o")){
	    	System.out.println("R�nica liczb to" + (a-b));
	    } else if(ee.equals("dz")){
	    	System.out.println("Dzielenie liczb to "+ (a/b));
	    }
	    else if (ee.equals("m")){
	    	System.out.println("Mno�enie liczb to "+ (a*b));
	    }
	    System.out.println("Czy chcesz wykonac program jeszcze raz (t/n)");
	    Scanner in2=new Scanner(System.in);
	   odp=in2.nextLine();
	    

		} while(odp.equals("t"));   
	}
}



