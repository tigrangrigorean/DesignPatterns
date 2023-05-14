package singleton;

public class SingletonLazy {
	
	private static SingletonLazy singletonLazy;

	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getInstance() {
		if(singletonLazy != null) {
			return singletonLazy;
		} else {
			return singletonLazy = new SingletonLazy();
		}
	}

}
