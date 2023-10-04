package A_Humanbody;
//Connecting classes HW, pt. 3

public class D_Main {

	public static void main(String[] args) {
		A_Head sc = new A_Head();
		sc.eyes = 2;
		sc.Eye();
		sc.ears = 2; 
		sc.Ears();
		sc.nose = 1;
		sc.Nose();
		sc.mouth = 1;
		sc.Mouth();
		
		
		System.out.println(" ");
		B_Body lo = new B_Body();  
		lo.body = 1; 
		lo.body1();
		
		System.out.println(" ");
		C_Bottom obj = new C_Bottom(); 
		obj.arms = 2; 
		obj.Arms();
		obj.legs = 2; 
		obj.Legs();
		


	}

}
