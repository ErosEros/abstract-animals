package animals.java;

public class Delfino extends Animal implements Nuotare{

	@Override
	void verso() {
		// TODO Auto-generated method stub
		System.out.println("Delfino: Iiiiiiiiiii");
	}

	@Override
	void mangia() {
		// TODO Auto-generated method stub
		System.out.println("Delfino mangia: Sardine");
	}

	@Override
	public void nuota() {
		// TODO Auto-generated method stub
		System.out.println("Delfino: Sto nuotando");
	}
}
