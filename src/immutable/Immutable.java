package immutable;

public final class Immutable {

	private final long id;
	private final String param;
	
	public Immutable(String param,long id) {
		this.id = id;
		this.param = param;
	}
	
	@Override
	public String toString() {
		return id + " | " + param;
	}
	
}
