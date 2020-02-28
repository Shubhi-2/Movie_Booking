package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Seat_Info implements Seat_Status {
	
	
	@Override
	public void blockSeat(int id, ArrayList<Seat_Attri> ai) {
		Iterator it=ai.iterator();
		while(it.hasNext())
		{
			Seat_Attri s1=(Seat_Attri)it.next();
			if(s1.getSeatId()==id)
			{
				s1.setSeatStatus("Blocked");
				System.out.println(seatStatus.BLOCKED);
			}
		}
		
		
		
	}

	@Override
	public void bookSeat(int id, ArrayList<Seat_Attri> ai) {
		// TODO Auto-generated method stub
		Iterator it=ai.iterator();
		while(it.hasNext())
		{
			Seat_Attri s1=(Seat_Attri)it.next();
			if(s1.getSeatId()==id)
			{
				s1.setSeatStatus("Booked");
				System.out.println(seatStatus.BOOKED);
			}
		}
		
	}

	@Override
	public void cancelSeat(int id, ArrayList<Seat_Attri> ai) {
		
		
			Iterator it=ai.iterator();
			while(it.hasNext())
			{
				Seat_Attri s1=(Seat_Attri)it.next();
				if(s1.getSeatId()==id)
				{
					s1.setSeatStatus("Available");
					System.out.println(seatStatus.AVAILABLE);
					s1.setSeatId(0);
				}
			}
	}
}
			
		
		
	

	
		
	


