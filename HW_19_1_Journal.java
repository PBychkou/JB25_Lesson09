public class HW_19_1_Journal extends HW_19_1_PrintPattern {

	private String topic;

	public HW_19_1_Journal(String title, int year, int pages, String lang, String topic) {
		super(title, year, pages, lang);
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
    }
    
	@Override
	public void show () {
		System.out.println("Title: " + title + ", Year: " + year + ", Pages: " + pages + ", Lang: " + lang + ", Topic: " + topic);
	}
}