package ogretmen;

public class OgretimGorevlisi extends Ogretmen{
	private String bölümAdi;
	

	public OgretimGorevlisi(int sicilNo) {
		super(sicilNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void derseGir() {
		System.err.println("Öğretim görevlisi derse girdi");
		
	}

	@Override
	public void notOku() {
		// TODO Auto-generated method stub
		
	}

	public String getBölümAdi() {
		return bölümAdi;
	}

	public void setBölümAdi(String bölümAdi) {
		this.bölümAdi = bölümAdi;
	}

}
