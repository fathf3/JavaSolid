package core.concretes;

import core.abstracts.Logger;

public class FileLogger implements Logger {
	@Override
	public void log(String data) {
		
		System.out.println(data+ " Dosyaya loglandi.");
		
	}
}
