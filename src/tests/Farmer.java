package tests;

public class Farmer {
	
	private String name;
	
	private String region;
	
	private int age;
	
	private String type;
	
	public Farmer(String name, String region, int age, String type) {
		this.name = name;
		this.region = region;
		this.age = age;
		this.type = type;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Farmer [name=" + name + ", region=" + region + ", age=" + age + ", type=" + type + "]";
	}
	
}
