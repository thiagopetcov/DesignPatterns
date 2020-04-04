public class Country {
	//Attributes 
	private String code;
	private String name;
	private String continent;
	private float surfaceArea;
	private String headOfState;
	
	//Object is ready to be made.
	
	public Country(String code, String name, String continent, float surfaceArea, String headOfState) {
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.surfaceArea = surfaceArea;
		this.headOfState = headOfState;
	}
	//Getters and Setters 
	public String getCode() {
		return code;
	}
	public void setcode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public float getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public String getHeadOfState() {
		return headOfState;
	}
	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}
	
	@Override
	public String toString() {
		return "Code: " + this.code + "\n" + 
			   "Name: " + this.name + "\n" + 
			   "Continent: " + this.continent + "\n" + 
			   "Surface: " + this.surfaceArea + "\n" + 
			   "State: " + this.headOfState + "\n\n";
	}
	
}

