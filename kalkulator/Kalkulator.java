package kalkulator;

import java.util.Scanner;

public class Kalkulator {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Podaj liczbê a");
		int a=in.nextInt();
		System.out.println("Podaj liczbê b");
		int b=in.nextInt();
		System.out.println("Wybierz dzia³anie(d) dodawanie, (o) odejmowanie, (dz) dzielenie, (m) mno¿enie");
		Scanner ww=new Scanner(System.in);
		String ee=ww.nextLine();
	    
	    if (ee.equals("d")) {
	    	System.out.println("Suma liczb to " +(a+b));
		} else if (ee.equals("o")){
	    	System.out.println("Ró¿nica liczb to" + (a-b));
	    } else if(ee.equals("dz")){
	    	System.out.println("Dzielenie liczb to "+ (a/b));
	    }
	    else if (ee.equals("m")){
	    	System.out.println("Mno¿enie liczb to "+ (a*b));
	    	
	    }
	}
}

