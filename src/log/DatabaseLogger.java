package log;

public class DatabaseLogger implements Log{

	@Override
	public void log() {
		System.err.println("veri tabanına loglandı");
		
	}

}
