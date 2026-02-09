import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> emplist1=new ArrayList<String>();
		emplist1.add("Smith");
		emplist1.add("George");
		emplist1.add("Jhones");
		emplist1.add("Kings");
		
		List<String> designations=new ArrayList<String>();
		designations.add("Manager");
		designations.add("HR");
		designations.add("Clerk");
		designations.add("Accounts");
		//addall()
		System.out.println(emplist1);
		System.out.println(designations);
		//set()
		designations.set(2,"Developer");
		designations.addFirst("CEO");
		emplist1.addFirst("Ram");
		emplist1.addAll(designations);
		//size()
		System.out.println("New Array Size"+emplist1.size());
		//emplist1.clear();
		System.out.println(emplist1);
		System.out.println("USing For Each Loop");
		for(String copy:emplist1)
		{
			System.out.println(copy);
		}
		
		System.out.println("using Iterator");
		
		Iterator<String> itr=emplist1.iterator();
		while(itr.hasNext())
		{
			String next=itr.next();
			System.out.println(next);
		}
		
		System.out.println("using ListIterator : Forward Direction");
		
		ListIterator<String> itr1=emplist1.listIterator();
		while(itr1.hasNext())
		{
			String next=itr1.next();
			System.out.println(next);
		}
		
        System.out.println("using ListIterator : backward Direction");
		
		ListIterator<String> itr2=emplist1.listIterator(emplist1.size());
		while(itr2.hasPrevious())
		{
			String previous=itr2.previous();
			System.out.println(previous);
		}
		

	}

}
