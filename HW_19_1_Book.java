public class HW_19_1_Book extends HW_19_1_PrintPattern {
    
    private String author;

	public HW_19_1_Book(String title, int year, int pages, String lang, String author) {
		super(title, year, pages, lang);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
    }
    
	@Override
	public void show() {
		System.out.println("Title: " + title + ", Year: " + year + ", Pages: " + pages + ", Lang: " + lang + ", Author: " + author);
	}
}