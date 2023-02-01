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
		 
//	PASSEROTTO					 
		 p.dormi();
		 p.verso();
	
//	AQUILA
		 a.mangia();
		 a.dormi();
		
//  DELFINO
		 d.verso();
		
		 
		 faiNuotare(c);
		 faiVolare(p);
		 faiNuotare(d);
		 faiVolare(a);
		 
	}

	public static void faiVolare(Volare Animale) {
		Animale.vola();
	}
	
	
	public static void faiNuotare(Nuotare Animale) {
		Animale.nuota();
	}
}
