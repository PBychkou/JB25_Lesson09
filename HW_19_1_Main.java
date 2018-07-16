import java.util.ArrayList;

public class HW_19_1_Main {

	public static void main(String[] args) {
        
		HW_19_1_Newspaper myNewspaper = new HW_19_1_Newspaper("Washington Post", 1986, 20, "English", "News");
		HW_19_1_Journal myJournal1 = new HW_19_1_Journal("GQ", 2018, 100, "Russian", "Men Style");
		HW_19_1_Journal myJournal2 = new HW_19_1_Journal("National Geographic", 2018, 33, "English", "Nature");
		HW_19_1_Book myBook = new HW_19_1_Book("Crime and Punishment", 1866, 80, "Russian", "F. M. Dostoevski");

		myNewspaper.show();
		myJournal1.show();
		myJournal2.show();
        myBook.show();
    }
}
