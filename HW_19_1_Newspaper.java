public class HW_19_1_Newspaper extends HW_19_1_PrintPattern {
    
    private String type;

	public HW_19_1_Newspaper(String title, int year, int pages, String lang, String type) {
		super(title, year, pages, lang);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void show () {
		System.out.println("Title: " + title + ", Year: " + year + ", Pages: " + pages + ", Lang: " + lang + ", Type: " + type);
	}
}