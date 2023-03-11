package 화면DB연결;

import java.util.Date;

public class miniprojectVO {
	private String bookid;
	private int weekno;
	private int yearno;
	private String booktitle;
	private int price;
	private String writer;
	private String publisher;
	private Date date;
	private String pic;
	
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public int getWeekno() {
		return weekno;
	}
	public void setWeekno(int weekno) {
		this.weekno = weekno;
	}
	public int getYearno() {
		return yearno;
	}
	public void setYearno(int yearno) {
		this.yearno = yearno;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}

	
	
	
}
