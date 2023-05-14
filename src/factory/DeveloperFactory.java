package factory;

public class DeveloperFactory {

	public Developer create(DeveloperType type) {
		
		Developer developer;
		
		switch(type) {
		
		case BACKEND:
			return developer = new BackendDeveloper();
		case FRONTEND:
			return developer = new FrontendDeveloper();
		default:
			throw new IllegalArgumentException("Wrong type of Developer");
		}
	}
	
}
