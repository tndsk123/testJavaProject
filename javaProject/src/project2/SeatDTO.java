package project2;

import java.sql.Date;

public class SeatDTO {
	private String room;
	private Date date;
	private String time;
	private String seat;
	private int price;
	public SeatDTO() {
	}
	
	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SeatDTO(String room, Date date, String time, String seat, int price) {
		super();
		this.room = room;
		this.date = date;
		this.time = time;
		this.seat = seat;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SeatDTO [room=" + room + ", date=" + date + ", time=" + time + ", seat=" + seat + ", price=" + price
				+ "]";
	}
	

}
