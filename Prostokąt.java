package lab2;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//lab2 zad2
public class Prostok¹t {
int dlugosc;
int szerokosc;

public Prostok¹t(int dlugosc, int szerokosc) {
	this.dlugosc=dlugosc;
	this.szerokosc=szerokosc;
}
public int pole() {
	return dlugosc * szerokosc;
}
public int obwod() {
	return 2*dlugosc+ 2*szerokosc;
}
public double przekatna() {
	double p= (pow(dlugosc,2))+(pow(szerokosc,2));
	return sqrt(p);
}
}
