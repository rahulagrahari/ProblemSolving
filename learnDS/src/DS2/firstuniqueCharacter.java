package DS2;

import java.util.ArrayList;
import java.util.List;

public class firstuniqueCharacter {
	
	
	public static void uniqueCharacter(String[] str) {
		
		
		List<String> temp = new ArrayList<String>();
		
		for(String i : str) {
			if(!temp.contains(i)) {
				temp.add(i);
			}
			else {
				temp.remove(i);
			}
		}
		
		System.out.println(temp.get(0));
	
	}
	
	public static void main(String[] args) {
		String[] str = {"M","O","R","N","O","R","M"};
		uniqueCharacter(str);
	}

}
