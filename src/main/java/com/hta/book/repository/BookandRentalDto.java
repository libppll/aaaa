package com.hta.book.repository;

public class BookandRentalDto {
	private int book_num;          
	private String  book_loc;
	private boolean  book_status;
	private String  book_img;
	private String  book_imdate;
	private boolean  book_res;
	private String  book_chunggu;
	private String  book_isbn;
	private String  book_title;          
	private String  book_label;          
	private String  book_author;          
	private String  book_genre;
	private int rental_num;
    private String rental_date;
	private String renbtal_returndate;
	private int return_sal;
	private int rental_extension;
	private int rental_res1;
	private int rental_return;           
	private String member_email;
	private int overdate;   //연체일
	private String returndate; //반납일
	private String 	book_resdate; //예약일
	private String book_resend; //예약 종료일
	
	
	public String getBook_resend() {
		return book_resend;
	}
	public void setBook_resend(String book_resend) {
		this.book_resend = book_resend;
	}
	public String getBook_resdate() {
		return book_resdate;
	}
	public void setBook_resdate(String book_resdate) {
		this.book_resdate = book_resdate;
	}
	public int getOverdate() {
		return overdate;
	}
	public void setOverdate(int overdate) {
		this.overdate = overdate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	public int getBook_num() {
		return book_num;
	}
	public void setBook_num(int book_num) {
		this.book_num = book_num;
	}
	public String getBook_loc() {
		return book_loc;
	}
	public void setBook_loc(String book_loc) {
		this.book_loc = book_loc;
	}
	public boolean isBook_status() {
		return book_status;
	}
	public void setBook_status(boolean book_status) {
		this.book_status = book_status;
	}
	public String getBook_img() {
		return book_img;
	}
	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}
	public String getBook_imdate() {
		return book_imdate;
	}
	public void setBook_imdate(String book_imdate) {
		this.book_imdate = book_imdate;
	}
	public boolean isBook_res() {
		return book_res;
	}
	public void setBook_res(boolean book_res) {
		this.book_res = book_res;
	}
	public String getBook_chunggu() {
		return book_chunggu;
	}
	public void setBook_chunggu(String book_chunggu) {
		this.book_chunggu = book_chunggu;
	}
	public String getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_label() {
		return book_label;
	}
	public void setBook_label(String book_label) {
		this.book_label = book_label;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public int getRental_num() {
		return rental_num;
	}
	public void setRental_num(int rental_num) {
		this.rental_num = rental_num;
	}
	public String getRental_date() {
		return rental_date;
	}
	public void setRental_date(String rental_date) {
		this.rental_date = rental_date;
	}
	public String getRenbtal_returndate() {
		return renbtal_returndate;
	}
	public void setRenbtal_returndate(String renbtal_returndate) {
		this.renbtal_returndate = renbtal_returndate;
	}
	public int getReturn_sal() {
		return return_sal;
	}
	public void setReturn_sal(int return_sal) {
		this.return_sal = return_sal;
	}
	public int getRental_extension() {
		return rental_extension;
	}
	public void setRental_extension(int rental_extension) {
		this.rental_extension = rental_extension;
	}
	public int getRental_res1() {
		return rental_res1;
	}
	public void setRental_res1(int rental_res1) {
		this.rental_res1 = rental_res1;
	}
	public int getRental_return() {
		return rental_return;
	}
	public void setRental_return(int rental_return) {
		this.rental_return = rental_return;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	
	
}
