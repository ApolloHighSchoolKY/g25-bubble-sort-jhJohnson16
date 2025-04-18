public class BubbleSort
{


		//Loop once for each pass, where passes is one less than the number of items.
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
				//If they are out of order, swap the values
			//End Loop for comparisons
    
			//The next pass will use one less comparison
    
		//End Loop for passes
	
	public static int [] bubbleSorter(int[] nums){
		int passes  = 0;
		int tempNum;

			while(passes <= nums.length -1){
				for(int i=0; i<nums.length-1; i++){
					tempNum = nums[i+1];
					nums[i+1] = nums[i];
					nums[i] = tempNum;
				}
			}
			passes++;
	
	return nums;
  }
}
