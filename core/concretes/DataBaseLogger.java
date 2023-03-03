package core.concretes;

import core.abstracts.Logger;

public class DataBaseLogger  implements Logger{
	@Override
	public void log(String data) {
		
		System.out.println(data + " DB'ye loglandi.");
		
	}
}
