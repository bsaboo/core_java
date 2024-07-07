package basic_challenges;

public class EqualSumChecker {
	public static void main(String[] args) {
		hasEqualSum(1, 1, 1);
		hasEqualSum(1, 1, 2);
		hasEqualSum(1, -1, 0);
	}
	
	public static boolean hasEqualSum(int num1, int num2, int num3){
        return (num1 + num2) == num3;
    }
}
