
public abstract class Animal {

	private String name;
	
	public Animal() {
		
	}
	public Animal(String name) {
		this.name=name;
	}
	
	public void dance() {
		System.out.println("this animal is dancing animal"+ this.name);
	}
	
	public void setName(String Name) {
		this.name=Name;
	}
	public String getName() {
		return this.name;
	}
	public abstract void shout() ;
	
	
}
