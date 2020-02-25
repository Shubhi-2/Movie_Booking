package project;

public class Seat_Attri {
	private int seatId;
private String seatStatus="Available";
private	double seatPrice;
	
	
	public String getSeatStatus() {
	return seatStatus;
}
public void setSeatStatus(String seatStatus) {
	this.seatStatus = seatStatus;
}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
	

}
