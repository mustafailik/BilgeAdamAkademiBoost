package log;

public class SMSLogger implements Log{

	@Override
	public void log() {
		System.err.println("SMS'e loglandı");
		
	}

}
