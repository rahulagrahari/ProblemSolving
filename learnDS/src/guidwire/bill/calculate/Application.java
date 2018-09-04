package guidwire.bill.calculate;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			String s = "00:03:01,111-111-111\n00:05:01,111-111-112\n00:03:01,111-111-111\n00:06:02,111-111-113";
			String s1 = "00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090";
			Solution sol = new Solution();
			System.out.println(sol.solution(s1));
			
			


	}

}
