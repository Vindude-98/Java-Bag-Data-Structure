
public class Main {

	public static void main(String[] args) {
		Bag<String> bag = new Bag();

		bag.add("Apple");
		bag.add("Strawberry");
		bag.add("Apple");
		bag.add("Orange");
		bag.add("Cucumber");
		bag.add("Apple");
		
		bag.printContents();
		
		System.out.println("\nBag contains Strawberry: " + bag.contains("Strawberry"));
		System.out.println("Bag contains Orange: " + bag.contains("Orange"));
		System.out.println("Bag contains Pear: " + bag.contains("Pear"));
		
		// Using the getFrequencyOf method to return count of an element
		System.out.println("\nFrequency of Apple: " + bag.getFrequencyOf("Apple"));
		
		System.out.println("\nRemoving one \"Apple\" element...\n");
		bag.remove("Apple");
		
		bag.printContents();
		
		System.out.println("\nBag contains Apple: " + bag.contains("Apple"));

		System.out.println("\nFrequency of Apple: " + bag.getFrequencyOf("Apple"));
	}

}