package DS2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class time {
	
	public static String getTime(int A, int B, int C, int D, int E, int F) {
		
		 List<Integer> nums = new ArrayList<>();
	        nums.add(A);
	        nums.add(B);
	        nums.add(C);
	        nums.add(D);
	        nums.add(E);
	        nums.add(F);
	        StringBuilder time = new StringBuilder();

	        Collections.sort(nums);
	        if(nums.get(0)==0 && nums.get(1)==0 && nums.get(2)==0){
	        	time.append(nums.get(0)+""+nums.get(3)+":"+nums.get(1)+""+nums.get(4)+":"+nums.get(2)+""+nums.get(5));
	            
	           return time.toString();
	        }
	        else {
	        	
	        	int[] duration = new int[2];
	        	for(int j=0;j<2;j++) {
	        		int i = nums.size()-1;
		        	int temp = 100;
		        	while(!(temp<60) && i>=0) {
		        		i--;
		        		temp = nums.get(i)*10+nums.get(nums.size()-1);
		        	}
		        	if (temp>=60) {
		        		return "NOT POSSIBLE";
		        	}
		        	duration[j]=temp;
		        	nums.remove(nums.size()-1);
		        	nums.remove(i);
	        	} 
	        	int hr = nums.get(0)*10+nums.get(1);
	        	if(hr>=24) {
	        		return "NOT POSSIBLE";
	        	}
	        	int min = duration[1];
	        	int sec = duration[0];
	        	time.append(hr+":"+min+":"+sec);
	        	return time.toString();
	        	
	        }
		
	     
	}
	
	public static void main(String[] args) {
		System.out.println(time.getTime(1, 8, 3, 2, 6, 4));
	}

}
