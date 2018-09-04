
public class Dog extends Animal{

	@Override
	public void shout() {
		System.out.println("bhow bhow");;
		
	}
	
	public void bark() {
		System.out.println("dog is barking");
	}
	
	public void dance() {
		System.out.println("this animal is dancing dog");
	}
	
	@Override
	public boolean equals(Object o) {
		return true;
	}
	
	

}
