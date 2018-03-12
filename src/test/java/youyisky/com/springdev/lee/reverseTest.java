package youyisky.com.springdev.lee;

public class reverseTest {

	public static int reverse(int x) {
		
		try {
			if (x > 0) {
				String s = Integer.toString(x);
				String strReverse = new StringBuffer(s).reverse().toString();
				return Integer.parseInt(strReverse);
			} else {
				String s = Integer.toString(-x);
				String strReverse = new StringBuffer(s).reverse().toString();
				return -Integer.parseInt(strReverse);
			}
			
		} catch (NumberFormatException e) {
			return 0;
		}

	}

	public static void main(String[] args) {
		int i=-153423646;
		System.out.println(reverse(i));
	}

}
