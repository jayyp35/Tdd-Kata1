package stringCalc;
import java.util.*;

public class stringCalc {
	public static ArrayList<Integer> negatives = new ArrayList<>();
	
	public static int Add(String numbers) {
		negatives.clear();
		
		if(numbers.isEmpty())
			return 0;
		else if (numbers.startsWith("//")) {
			int index = numbers.indexOf("\n");
			String delimiter = "\n";
			
			if(index > 3) {
				String delim = numbers.substring(3,index-1);
				delimiter = delim + "|" + delimiter;
				numbers = numbers.substring(index+1);
			} else {
				delimiter = numbers.charAt(2) + "|" + delimiter;
				numbers = numbers.substring(4);
			}
			
			String[] nums = numbers.split(delimiter);
			
			int sum = 0;
			
			for(int i=0;i<nums.length;i++) {
				int num = Integer.parseInt(nums[i]);
				if(num < 0) {
					negatives.add(num);
				}else {
					if(num>1000)
						continue;
					
					sum += num;
				}
					
			}
			
			if(negatives.size()>0)
				return -1;
			
			return sum;
			
			
		} else {
			String[] nums = numbers.split(",|\n");
			
			int sum = 0;
			
			for(int i=0;i<nums.length;i++) {
				int num = Integer.parseInt(nums[i]);
				if(num < 0) {
					negatives.add(num);
				}else {
					if(num>1000)
						continue;
					
					sum += num;
				}
					
			}
			
			if(negatives.size()>0)
				return -1;
			
			return sum;
		}
	}
}
