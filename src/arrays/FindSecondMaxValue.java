package arrays;

public class FindSecondMaxValue {

	public static void main(String[] args) {
		int[] arr = {12,674,78,35,35,34,32,54};
		int maxValue = Integer.MIN_VALUE; 
		int secondMaxValue = Integer.MIN_VALUE;	//arr[0]-11
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				secondMaxValue = maxValue;
				maxValue = arr[i];
			}else if(arr[i] > secondMaxValue && arr[i] != maxValue){
				secondMaxValue= arr[i];
			}
		}
		System.out.println("Max : " + maxValue + "\nSecond Max: " +secondMaxValue );
	}

}
