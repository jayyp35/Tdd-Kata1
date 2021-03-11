package stringCalc;
import java.util.*;

public class stringCalc {
	
	public static int Add(String numbers) {
		if(numbers.isEmpty())
			return 0;
		else if (numbers.startsWith("//")) {
			String delimiter = "\n";
			delimiter = numbers.charAt(2) + "|" + delimiter;
			
			numbers = numbers.substring(4);
			String[] nums = numbers.split(delimiter);
			
			int sum = 0;
			
			for(int i=0;i<nums.length;i++) {
				sum += Integer.parseInt(nums[i]);
			}
			
			return sum;
			
			
		} else {
			String[] nums = numbers.split(",|\n");
			
			int sum = 0;
			
			for(int i=0;i<nums.length;i++) {
				sum += Integer.parseInt(nums[i]);
			}
			
			return sum;
		}
	}
}
