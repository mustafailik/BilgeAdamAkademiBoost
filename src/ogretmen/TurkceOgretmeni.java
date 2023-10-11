package ogretmen;

public class TurkceOgretmeni extends Ogretmen{
	

	public TurkceOgretmeni(int sicilNo) {
		super(sicilNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void derseGir() {
		System.err.println("Türkçe öğretmeni derse girdi");
		
	}

	@Override
	public void notOku() {
		System.err.println("Türkçe öğretmeni notları okudu");
		
	}

}
