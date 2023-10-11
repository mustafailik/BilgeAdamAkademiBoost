package Hastane;

public class Main {

	public static void main(String[] args) {
		ornek1();
		//ornek2();
		//ornek3();

	}

private static void ornek1() {
		Hasta hasta = new Hasta();
		hasta.randevuAl(new Psikiyatri(50));
		//hasta.randevuAl(new Dahiliye(50));
	}
	
private static void ornek2() {
		Psikiyatri psk = new Psikiyatri(50);
		psk.randevu();
		
	}
private static void ornek3() {
		Dahiliye dahiliye = new Dahiliye(50);
		dahiliye.numuneAl();
	}
}
