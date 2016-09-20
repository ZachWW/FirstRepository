
import java.util.ArrayList;

public class AddressBook extends BuddyInfo {

	private ArrayList<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is address");
	}
	
	public void addBuddy(BuddyInfo buddy) {
		buddyList.add(buddy);
	}
	
	public void removeBuddy(int index) {
		buddyList.remove(index);
	}
}
