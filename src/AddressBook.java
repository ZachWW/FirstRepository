
import java.util.ArrayList;

public class AddressBook {

	private ArrayList<BuddyInfo> buddyList;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey there");
		BuddyInfo buddy = new BuddyInfo("Tim", "Carleton", "613-333-3333");
		AddressBook book1 = new AddressBook();
		book1.addBuddy(buddy);
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
