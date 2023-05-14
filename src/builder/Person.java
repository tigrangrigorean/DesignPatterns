package builder;

public class Person {
	
	private String name;
	private int age;
	private String country;
	private String city;
	
	public Person() {
		
	}
	
	public static class Builder {
		
		Person person;
		
		public Builder() {
			person = new Person();
		}
		
		public Builder setName(String name) {
			person.name = name;
			return this;
		}
		
		public Builder setAge(int age) {
			person.age = age;
			return this;
		}
		
		public Builder setCountry(String country) {
			person.country = country;
			return this;
		}
		
		public Builder setC(String city) {
			person.city = city;
			return this;
		}
		
		public Person build() {
			return person;
		}
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", country=" + country + ", city=" + city + "]";
	}
	
}
