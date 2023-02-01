package animals.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// CREO UN ANIAMALE		
		 Cane c = new Cane();
// CREO UN ANIAMALE	
		 Passerotto p = new Passerotto();
// CREO UN ANIAMALE	
		 Aquila a = new Aquila();
// CREO UN ANIAMALE	
		 Delfino d = new Delfino();
	
		 
		 
		 
//	CANE
		 c.verso();
		 c.nuota();
//	PASSEROTTO					 
		 p.dormi();
		 p.verso();
		 p.vola();
//	AQUILA
		 a.mangia();
		 a.dormi();
		 a.vola();
//  DELFINO
		 d.verso();
		 d.nuota();
		 
	}

}
