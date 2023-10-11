package Hastane;

import java.util.Scanner;

public class Dahiliye implements Poliklinik , NumuneAlabilir{
		private final Integer gunlukKapasite;
	
		public Dahiliye(Integer gunlukKapasite) {
			super();
			this.gunlukKapasite = gunlukKapasite;
		}

	@Override
	public void girisYap() {
		System.err.println("dahiliye sistemine giriş yapıldı");
		
	}

	@Override
	public void muayeneYap() {
		System.err.println("hasta muayene edildi");
		
	}
	
	@Override
	public void randevu() {
		Scanner input = new Scanner(System.in);
		System.err.println("hasta sıra sayısını giriniz:");
		int siraSayisi=input.nextInt();
		if (siraSayisi <=getGunlukKapasite()) {
			System.err.println("dahiliyeden randevu verildi");
		}
		else {
			System.err.println("randevu verilemedi. Başka bir güne bakınız.");
		}
	}

	@Override
	public void numuneAl() {
		System.err.println("numune alındı");
		
	}
	public Integer getGunlukKapasite() {
		return gunlukKapasite;
	}


}
