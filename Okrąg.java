package lab2;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Okr¹g {
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
	return "Wprowadzony pkt znajduje siê  w okrêgu";
	 else
		return"Wprowadzony pkt jest poza okrêgiem";
}

 public Okr¹g (){
	this.srodek.x=srodek.x;
	this.srodek.y=srodek.y;
}
 public Okr¹g(int punkt, int promien) {
		this.punkt=punkt;
		this.promien=promien;
	}
	public Okr¹g(int x,int y, double srednica) {
		this.x=x;
		this.y=y;
		this.srednica=srednica;
	}
	//4d
	public static Okr¹g getOkr¹g(int x, int y) {
		Prostok¹t p1= new Prostok¹t(x,y);
		double a= pow(x,2)+ pow(y,2);//srednica
		double b= sqrt(a);
		return new Okr¹g(3,2,b);
		
		public static Okr¹g getOkr¹g1(int x, int y) {
			Prostok¹t p2= new Prostok¹t(x,y);
			double a= y;
			
			return new Okr¹g(3,2,a);

}

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



