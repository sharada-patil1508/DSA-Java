package OOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human kunal=new  Human(22,"sharada",1000,false);
		Human sharada=new  Human(25,"sharada_patil",2000,true);
		System.out.println(kunal.name);
		
		
		System.out.println(kunal.population);
		System.out.println(sharada.population);

	}

	public void greeting() {
		System.out.println("heloo!");
		
	}

}
