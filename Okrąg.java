package lab2;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Okr�g {
	//lab2 zad4a
	Punkt srodek;
	int promien;
	
	//zad4b
public double getPowierzchnia() {
	return (3.14 * pow(promien,2));
}
public int setSrednica() {
	return 2*promien;
}
public int getPromien() {
	return promien;
}
public String wsrodku(int x, int y){
	if((pow(x-srodek.x,2))+(pow(y-srodek.y,2))<(pow(promien,2)))
	return "Wprowadzony pkt znajduje si�  w okr�gu";
	 else
		return"Wprowadzony pkt jest poza okr�giem";
}

 public Okr�g (){
	this.srodek.x=srodek.x;
	this.srodek.y=srodek.y;
}
 public Okr�g(int punkt, int promien) {
		this.punkt=punkt;
		this.promien=promien;
	}
	public Okr�g(int x,int y, double srednica) {
		this.x=x;
		this.y=y;
		this.srednica=srednica;
	}
	//4d
	public static Okr�g getOkr�g(int x, int y) {
		Prostok�t p1= new Prostok�t(x,y);
		double a= pow(x,2)+ pow(y,2);//srednica
		double b= sqrt(a);
		return new Okr�g(3,2,b);
		
		public static Okr�g getOkr�g1(int x, int y) {
			Prostok�t p2= new Prostok�t(x,y);
			double a= y;
			
			return new Okr�g(3,2,a);

}

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



