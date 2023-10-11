package ogretmen;

public abstract class Ogretmen {
	private String name;
	private int yas;
	private final int sicilNo;
	
	public Ogretmen(int sicilNo) {
		super();
		this.sicilNo = sicilNo;
	}
	
	public abstract void derseGir();
	public abstract void notOku();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public int getSicilNo() {
		return sicilNo;
	}

}
