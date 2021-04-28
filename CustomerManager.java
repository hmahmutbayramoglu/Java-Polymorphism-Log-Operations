package inheritance2;

 

public class CustomerManager {
	
	
	
 
	public void add(BaseLogger... baseLoggers) {
		
	System.out.println("Müþteri eklendi");	
	
	for(BaseLogger baseLogger:baseLoggers) {
		baseLogger.log();
	}
 
	
	}

}
