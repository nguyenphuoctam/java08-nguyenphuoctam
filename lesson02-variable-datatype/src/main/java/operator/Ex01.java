package operator;

public class Ex01 {
	public static void main(String[] args) {
		int n = 7;
		//System.out.println(n++);

		boolean type = n % 2 == 0;
//		if(type) {
//			
//		}
		n = n++;
		System.out.println(n);
	}
}
