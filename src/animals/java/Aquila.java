package animals.java;

public class Aquila extends Animal implements Volare{

	

	@Override
	void verso() {
		// TODO Auto-generated method stub
		System.out.println("Aquila: Hhhhhhuuuuuuuuuu");
	}

	@Override
	void mangia() {
		// TODO Auto-generated method stub
		System.out.println("Aquila mangia: Lepri");
	}

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("Aquila: Vola");
	}
}
