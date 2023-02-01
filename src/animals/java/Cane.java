package animals.java;

public class Cane extends Animal implements Nuotare {

	
	@Override
	void verso() {
		// TODO Auto-generated method stub
		System.out.println("Cane: Grrrrrrrr");
	}

	@Override
	void mangia() {
		// TODO Auto-generated method stub
		System.out.println("Cane mangia: Croccantini");
	}

	@Override
	public void nuota() {
		// TODO Auto-generated method stub
		System.out.println("Cane : Nuota");
	}

}
