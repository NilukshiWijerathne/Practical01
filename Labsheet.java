import java.util.Collection;
import java.util.LinkedList;

class Collectionpractical1 {
	public Collectionpractical1 () {
		Collection<Integer> c = new LinkedList();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		c.remove(Integer.valueOf(2));

		System.out.println("Is the Collection Empty? " + c.isEmpty());
		
		System.out.println("Size of the Collection :" + c.size());
		 
		int elementToCheck = 5;
		System.out.println("Does the collection contain " + elementToCheck + "? " + c.contains(elementToCheck));

		
		System.out.println("Elements in the connection after removal :" + c);
	}
	
    public static void main(String args[]){
		new Collectionpractical1();
	}
}