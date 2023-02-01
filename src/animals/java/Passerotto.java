package animals.java;

public class Passerotto extends Animal implements Volare {
	
	

	@Override
	void verso() {
		// TODO Auto-generated method stub
		System.out.println("Passerotto: Pipipipipi");
	}

	@Override
	void mangia() {
		// TODO Auto-generated method stub
		System.out.println("Passerotto mangia: Mangime");
	}

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("Passerotto : Sto volando");
	}
}
