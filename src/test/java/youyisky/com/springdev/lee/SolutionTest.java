package youyisky.com.springdev.lee;

public class SolutionTest {

	public static boolean isPalindrome(int x) {
		String s = Integer.toString(x);
		String a=new StringBuffer(s).reverse().toString();
		if (s.equals(a)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
    System.out.println(isPalindrome(12345));
    System.out.println(isPalindrome(123454321));
	}

}
