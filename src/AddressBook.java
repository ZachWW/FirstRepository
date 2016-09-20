
import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> buddyList;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is address");
		AddressBook book1 = new AddressBook();
		book1.addBuddy(new BuddyInfo("Tim", "Carleton", "613-333-3333"));
		book1.removeBuddy(0);
	}
	
	public AddressBook() {
		buddyList = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddy) {
		buddyList.add(buddy);
	}
	
	public void removeBuddy(int index) {
		buddyList.remove(index);
	}
}
