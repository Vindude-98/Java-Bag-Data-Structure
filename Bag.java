import java.util.ArrayList;

public class Bag<T> {
	private ArrayList<T> items;
	
	public Bag() {
		items = new ArrayList<>();
	}
	
	// Add an item to the bag
	public void add(T item) {
		items.add(item);
	}
	
	// Remove one occurrence of an item from the bag
	public boolean remove(T item) {
		return items.remove(item);
	}
	
	// Check if the bag contains the item
	public boolean contains(T item) {
		return items.contains(item);
	}
	
	// Return frequency of element in bag
	public int getFrequencyOf(T item) {
		int count = 0;
		for (T currentItem : items) {
			if (currentItem.equals(item)) {
				count++;
			}
		}
		return count;
	}
	
	public void printContents() {
		if (items.isEmpty()) {
			System.out.println("The bag is empty.");
		}
		else {
			System.out.println("Bag contents: ");
			for (T item : items) {
				System.out.println("- " + item);
			}
		}
	}
}
