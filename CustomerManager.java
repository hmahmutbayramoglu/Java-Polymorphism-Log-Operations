package inheritance2;

 

public class CustomerManager {
	
	
	
 
	public void add(BaseLogger... baseLogger) {
		
	System.out.println("M��teri eklendi");	
	
	for(BaseLogger baseLoggers:baseLogger) {
		baseLoggers.log();
	}
 
	
	}

}
