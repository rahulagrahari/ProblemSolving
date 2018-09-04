package DS2;

import java.util.ArrayList;

public class SubString {

	public static ArrayList<Character> subString(char[] ch, int i, int j) {
		
		ArrayList<Character> longestSubString = new ArrayList<Character>();
		if(i==j) {
			longestSubString.add(ch[i]);
			return longestSubString;
		}
		else {
			ArrayList<Character> temp1 = new ArrayList<Character>();
			ArrayList<Character> temp = new ArrayList<Character>();
			temp1=subString(ch, i+1,j);
				if(!temp1.contains(ch[i])) {
					longestSubString.add(ch[i]);
					longestSubString.addAll(temp1);
					return longestSubString;}
				else  {
					temp=subString(ch, 0, i+1);
					if (temp1.size()<=temp.size()) {
						longestSubString.add(ch[i]);
						longestSubString.addAll(temp);
						return longestSubString;}
					else {
						longestSubString.add(ch[i]);
						longestSubString.addAll(temp1);
						return longestSubString;
					}
				}
			
		}
		
	}
	
	public static String sString(String s) {
		boolean[] visited = new boolean[256];
		ArrayList longest = new ArrayList();
		ArrayList temp = new ArrayList();
		int i=0;
		while(i<s.length()) {
			if(i==s.length()){
				return longest.toString();
			}
			else if(!visited[s.charAt(i)]) {
				longest.add(s.charAt(i));
				visited[s.charAt(i)]=true;
				
			}
			else {
				if(temp.size()<longest.size()) {
					temp=longest;
				}
				longest = new ArrayList();
				longest.add(s.charAt(i));
				
			}
			i++;
		} 
		if(temp.size()<longest.size()) return longest.toString();
		else return temp.toString();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcddefg";
		System.out.println(sString(s));
		
		
	}

}
