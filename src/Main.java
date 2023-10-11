import ogretmen.ArastirmaGorevlisi;
import ogretmen.OgretimGorevlisi;
import ogretmen.TurkceOgretmeni;

public class Main {

	public static void main(String[] args) {
		//ornek1();
		//ornek2();
		//ornek3();

	}

	private static void ornek3() {
		OgretimGorevlisi ogretimGorevlisi = new OgretimGorevlisi(1234);
		ogretimGorevlisi.derseGir();
		ogretimGorevlisi.setBölümAdi("Veri Yapıları");
		System.err.println("öğretim görevlisinin branşı:" + ogretimGorevlisi.getBölümAdi());
	}

	private static void ornek2() {
		ArastirmaGorevlisi arastirma = new ArastirmaGorevlisi(5678);
		arastirma.notOku();
		
	}

	private static void ornek1() {
		TurkceOgretmeni tr = new TurkceOgretmeni(1478);
		tr.derseGir();
		tr.notOku();
		
	}

}
