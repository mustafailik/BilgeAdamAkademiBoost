package Hastane;

import java.util.Scanner;

public class Psikiyatri implements Poliklinik{
	private final Integer gunlukKapasite;
	
	public Psikiyatri(Integer gunlukKapasite) {
		super();
		this.gunlukKapasite = gunlukKapasite;
	}

	@Override
	public void girisYap() {
		System.err.println("psikiyatri sistemine giriş yapıldı");
		
	}

	@Override
	public void muayeneYap() {
		System.err.println("Muayene yapıldı");
		
	}

	@Override
	public void randevu() {
		Scanner input = new Scanner(System.in);
		System.err.println("hasta sıra sayısını giriniz:");
		int siraSayisi=input.nextInt();
		if (siraSayisi <=getGunlukKapasite()) {
			System.err.println("psikiyatriden randevu verildi");
		}
		else {
			System.err.println("randevu verilemedi. Başka bir güne bakınız.");
		}
	}

	public Integer getGunlukKapasite() {
		return gunlukKapasite;
	}

}
