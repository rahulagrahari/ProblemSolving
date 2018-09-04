package DS2;

public class uniqueChar {

	public static boolean unique(String s) {
		boolean[] c = new boolean[256];
		for(int i =0; i<s.length();i++) {
			int v = s.charAt(i);
			if(c[v]) return false;
			c[v]=true;
		}
		return true;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(unique("rahulwa"));

	}

}
