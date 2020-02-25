package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Seat_Main {
	static ArrayList<Seat_Attri> al=new ArrayList<>();

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter choice");
	int ch=sc.nextInt();
	
	Seat_Info ob=new Seat_Info();
	
	Seat_Attri ob1=new Seat_Attri();
	ob1.setSeatId(101);
	al.add(ob1);
	
	Seat_Attri ob2=new Seat_Attri();
	ob2.setSeatId(102);
	al.add(ob2);
	
	Seat_Attri ob3=new Seat_Attri();
	ob3.setSeatId(103);
	al.add(ob3);
	
	
	int id1;
	switch(ch) {
	case 1:
		System.out.println("Enter id");
		id1=sc.nextInt();
	
	ob.blockSeat(id1,al);
		break;
	case 2:
		System.out.println("Enter id");
		id1=sc.nextInt();
	
		ob.bookSeat(id1,al);
		break;
	case 3:
		System.out.println("Enter id");
		id1=sc.nextInt();
	
		ob.cancelSeat(id1,al);
		break;
		default:
			System.out.println("Wrong choice");}
		
		
		

	}

}
