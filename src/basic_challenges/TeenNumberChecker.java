package basic_challenges;

public class TeenNumberChecker {

	public static void main(String[] args) {
		hasTeen(9, 99, 19);
		hasTeen(23, 15, 42); 
		hasTeen(22, 23, 34);
	}
	public static boolean hasTeen(int num1, int num2, int num3){
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }
    public static boolean isTeen(int num){
        if(num >=13 && num <=19)
            return true;
        else 
            return false;
    }

}
