package DS2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class frequentNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,3,2,1,3,3,2,1,5, 5, 5, 5 ,5, 5};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		
		Set set = hm.entrySet();
		Iterator it = set.iterator();
		int max = 0;
		int key = -1;
		while(it.hasNext()) {
			Map.Entry kv = (Entry) it.next();
			if(max < (int)kv.getValue()) {
				max = (int) kv.getValue();
				key = (int) kv.getKey();
			}
//			System.out.println("key: "+ kv.getKey() + " value: "+ kv.getValue());
		}
		System.out.println("key: "+ key + " value: "+ max);

	}

}
