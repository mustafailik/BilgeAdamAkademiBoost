package main;

import Hastane.Dahiliye;
import Hastane.Psikiyatri;
import log.DatabaseLogger;
import log.EMailLogger;
import log.Logger;

public class Main {

	public static void main(String[] args) {
		//ornek1();
		//ornek2();
		ornek3();
		

	}

private static void ornek3() {
		Logger logger= new Logger();
		logger.logla(new DatabaseLogger());
		logger.logla(new EMailLogger());
	}

private static void ornek1() {
	Psikiyatri psk = new Psikiyatri(50);
	psk.randevu();
	}
	
private static void ornek2() {
	Dahiliye dahiliye = new Dahiliye(50);
	dahiliye.numuneAl();
		
	}

}
