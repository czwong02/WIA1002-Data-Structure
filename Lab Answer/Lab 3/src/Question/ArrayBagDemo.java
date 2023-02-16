package Question;

public class ArrayBagDemo {
    
    private static void testAdd(BagInterface<String> aBag, String[] content) {
        System.out.print("Adding ");
        for (String content1 : content) {
            aBag.add(content1);
            System.out.print(content1 + " ");
        } 
      System.out.println();
      displayBag(aBag);
    }
    
    private static void displayBag(BagInterface<String> aBag) {
        System.out.println("The bag contains " + aBag.getCurrentSize() +
		                   " string(s), as follows:");		
		Object[] bagArray = aBag.toArray();
		for (int index = 0; index < bagArray.length; index++)
		{
			System.out.print(bagArray[index] + " ");
		} 
		
		System.out.println();
    }
    
    public static void main(String[] args) {
        
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        
        BagInterface<String> bag1 = new ArrayBag<>(); 
        BagInterface<String> bag2 = new ArrayBag<>(); 
        
        
        System.out.println("bag1:");
        testAdd(bag1, contentsOfBag1);
        
        System.out.println("bag2:");
        testAdd(bag2, contentsOfBag2);
        
        System.out.println("bag3, test the method union of bag1 and bag2:");
        BagInterface<String> everything = bag1.union(bag2);
        displayBag(everything);
        
        System.out.println("bag4, test the method intersection of bag1 and bag2:");
        BagInterface<String> commonItems = bag1.intersection(bag2);
        displayBag(commonItems);
        
        System.out.println("bag5, test the method difference of bag1 and bag2:");
        BagInterface<String> leftOver1 = bag1.difference(bag2);
        displayBag(leftOver1);
        
        
        System.out.println("bag6, test the method difference of bag2 and bag1:");
        BagInterface<String> leftOver2 = bag2.difference(bag1);
        displayBag(leftOver2);
    }
}