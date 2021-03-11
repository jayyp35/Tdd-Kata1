package stringCalc;
import java.util.*;

public class stringCalc {
	
	public static int Add(String numbers) {
		if(numbers.isEmpty())
			return 0;
		else {
			String[] nums = numbers.split(",");
			
			int sum = 0;
			
			for(int i=0;i<nums.length;i++) {
				sum += Integer.parseInt(nums[i]);
			}
			
			return sum;
		}
	}
}
