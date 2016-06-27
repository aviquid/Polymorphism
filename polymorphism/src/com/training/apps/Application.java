package com.training.apps;

import java.util.*;
import com.training.ifaces.Automobile;
import com.training.domain.ShowRoom;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch="Y";
		do{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1 for maruti 2 for toyota 3 for bikes");
		int key=sc.nextInt();
		ShowRoom obj=new NewShowroom();
		Automobile polyAuto=obj.getModel(key);

		if(polyAuto!=null)
			obj.printQuote(polyAuto);
		else
			System.out.println("INVALID");
		
		System.out.println("Y to continue, n to exit");
		ch=sc.next();
		
		}while(ch.equals("Y"));
	}

}