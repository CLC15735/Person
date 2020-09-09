import java.util.List;

public class search extends person {
	
	public search() {
		
	}
	
	public void searchByName (String name, List info, String searchName) {	
		for (int i=0; i < info.size(); i++) {
			if (name == searchName) {
				System.out.println(info.get(i));
			}
			
			
		}
		
	}
}
