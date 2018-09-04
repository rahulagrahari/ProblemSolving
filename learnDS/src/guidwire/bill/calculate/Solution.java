package guidwire.bill.calculate;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Solution {

	public int solution(String S) {
		
		int totalBill = billDetail(S);
		return totalBill;
		
	}
	
	
	private int billDetail(String S){
		
		Scanner s = new Scanner(new StringReader(S));
		Map<String, perCallDetail> callBook = new HashMap<String, perCallDetail>();
		int totalAmount=0;
		while(s.hasNext()) {
			String line = s.nextLine();
			String[] temp = line.split(",");
			String[] time = temp[0].split(":");
			
			int callDuration = Solution.getCallDuration(time);
			int cost = Solution.billCalculator(callDuration);
			totalAmount = totalAmount  + cost;
			
			if (callBook.containsKey(temp[1])) {
				perCallDetail callDetail = callBook.get(temp[1]);
				callDetail.setCallCosst(callDetail.getCallCosst()+cost);
				callDetail.setCallDuration(callDetail.getCallDuration()+callDuration);
				
			}
			else {
				perCallDetail callDetail = new perCallDetail(temp[1], callDuration, cost);
				callBook.put(temp[1], callDetail);
			}
			
		}
		
		totalAmount = totalAmount-getDiscount(callBook);
		
		return totalAmount;
		
	}
	
	
	private static int billCalculator(int callDuration) {
		int cost=0;
		
		if(isLessThanFiveMin(callDuration)) {
			
			cost = costPerSec(callDuration);
		}
		else {
			cost = costPerMin(callDuration);
		}
		return cost;
		
	}
	
	private static boolean isLessThanFiveMin(int callDuration) {
		int min = callDuration/60;
		if (min<5)
			return true;
		else
			return false;
	}
	
	
	private static int getCallDuration(String[] time) {
		
		int callDuration = Integer.parseInt(time[0])*3600+Integer.parseInt(time[1])*60+Integer.parseInt(time[2]);
		return callDuration;
	}
	private static int costPerMin(int callDuration) {
		int min = callDuration/60;
		int sec = callDuration%60;
		if(sec!=0)
			return (min+1)*150;
		else
			return (min)*150;
	}
	
	
	private static int costPerSec(int callDuration) {
		return (callDuration)*3;
	}
	
	
	private int getDiscount(Map<String, perCallDetail> callBook) {
		
		int longestDuration=-1;
		String phoneNum="";
		int discount = 0;
		for (Entry<String, perCallDetail> entry : callBook.entrySet()) {
		    perCallDetail call = entry.getValue();
		    if (call.getCallDuration()>longestDuration) {
		    	longestDuration = call.getCallDuration();
		    	phoneNum=call.number;
		    }
		    else if(call.getCallDuration()==longestDuration) {
		    	int comparator = compareTwoPhoneNumber(call.number, phoneNum);
		    	if(comparator==-1) {
		    		phoneNum=call.number;
		    	}
		    }
		    
		}
		discount = callBook.get(phoneNum).getCallCosst();
		return discount;
		
	}
	
	private int compareTwoPhoneNumber(String s1, String s2) {
		return s1.compareTo(s2);		
	}
	
	class perCallDetail{
		String number;
		private int callDuration;
		private int callCosst;
		
		public perCallDetail(String number, int callDuration, int callCosst) {
			super();
			this.number = number;
			this.callDuration = callDuration;
			this.callCosst = callCosst;
		}
		
		public int getCallDuration() {
			return callDuration;
		}
		public void setCallDuration(int callDuration) {
			this.callDuration = callDuration;
		}
		public int getCallCosst() {
			return callCosst;
		}
		public void setCallCosst(int callCosst) {
			this.callCosst = callCosst;
		}
				
		
	}
	
}
