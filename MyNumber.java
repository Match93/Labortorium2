package lab2;
import static java.lang.Math.*;

//lab2 zad3
public class MyNumber {
	
	double number;

	public MyNumber(double number) {
		this.number=number;
	}
	 public static boolean isOdd(int a){
      if (a%2!=0);
      return true;
	 }
	
	 public static boolean isEven(int a){
	      if (a%2==0);
	      return true;
		 }
	
	public static double sqrt() {
		return sqrt();
	}
	public MyNumber pow(MyNumber x) {
		return new MyNumber (Math.pow (number, x.number));
	}
	
	public MyNumber add(MyNumber x) {
		return new MyNumber(number + x.number));
	}
		
		public MyNumber substract(MyNumber x) {
			return new MyNumber(number - x.number));
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
