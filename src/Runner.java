import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	public static List <person> people = new ArrayList <>();

	public static void main(String[] args) {
		person Mark = new person ();
		Mark.setName("Mark");
		Mark.setAge(23);
		Mark.setJobtitle("Waiter");
		
		person Amanda = new person ();
		Amanda.setName("Amanda");
		Amanda.setAge(27);
		Amanda.setJobtitle("Engineer");
		
		person Tim = new person ();
		Tim.setName("Tim");
		Tim.setAge(32);
		Tim.setJobtitle("Barista");
		
		person John = new person ();
		John.setName("John");
		John.setAge(24);
		John.setJobtitle("Chemist");
		
		people.add(Mark);
		people.add(Amanda);
		people.add(Tim);
		people.add(John);
		
		findPersonByName ("Mark");
		
		//System.out.println(info);
		
		
//		for (int i=0; i < info.size(); i++) {
//			if (info.get(i).getName()== givename) {
//				System.out.println(info.get(i));
//			}
//			
//			
//		}
		
		//for (int i=0; i < info.size(); i++) {
			//name.searchByName(givename, info, info.get(i).getName());
		//}

	
	}
	public static void findPersonByName (String name) {
		for (person p : people) {
			if (p.getName().contentEquals(name)) {
				System.out.println(p);
			}
		}
	}
 }
