package board.domain;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {
	private int num;
	private String filepath;
	private String filename;
	private int bookisbn;
	private String bookname;
	private String bookmake;
	private String bookfrom;
	private int bookprice;
	private String bookintro;
	private MultipartFile image;
	
	public BoardVO() {}
	
	
	
	public BoardVO(String filepath, String filename, int bookisbn, String bookname, String bookmake,
			String bookfrom, int bookprice, String bookintro) {
		super();
		this.filepath = filepath;
		this.filename = filename;
		this.bookisbn = bookisbn;
		this.bookname = bookname;
		this.bookmake = bookmake;
		this.bookfrom = bookfrom;
		this.bookprice = bookprice;
		this.bookintro = bookintro;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getBookisbn() {
		return bookisbn;
	}
	public void setBookisbn(int bookisbn) {
		this.bookisbn = bookisbn;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookmake() {
		return bookmake;
	}
	public void setBookmake(String bookmake) {
		this.bookmake = bookmake;
	}
	public String getBookfrom() {
		return bookfrom;
	}
	public void setBookfrom(String bookfrom) {
		this.bookfrom = bookfrom;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public String getBookintro() {
		return bookintro;
	}
	public void setBookintro(String bookintro) {
		this.bookintro = bookintro;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}

}
