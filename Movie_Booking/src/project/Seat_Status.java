package project;

import java.util.ArrayList;

public interface Seat_Status {
	public void blockSeat(int id, ArrayList<Seat_Attri> ai);
	public void bookSeat(int id, ArrayList<Seat_Attri> ai);
	public void cancelSeat(int id, ArrayList<Seat_Attri> ai);
	

}
