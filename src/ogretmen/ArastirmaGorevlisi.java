package ogretmen;

public class ArastirmaGorevlisi extends OgretimGorevlisi{

	public ArastirmaGorevlisi(int sicilNo) {
		super(sicilNo);
		
	}

	@Override
	public void notOku() {
		System.err.println("araştırma görevlisi notları okudu");
		
	}

}
