package stringCalc;
import java.util.*;

public class stringCalc {
	
	public static int Add(String numbers) {
		if(numbers.isEmpty())
			return 0;
		else {
			String[] nums = numbers.split(",");
			
			int sum = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
			return sum;
		}
	}
}
