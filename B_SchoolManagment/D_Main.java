package B_SchoolManagement;

public class D_Main {

	public static void main(String[] args) {
		System.out.println("Teacher's Information");
		A_Teacher lo = new A_Teacher(); 
		lo.total = 154;
		lo.senior = 100;
		lo.junior = 54; 
		lo.Total();
		lo.Senior();
		lo.Junior();

		System.out.println(" ");
		System.out.println("Student's Information");
		B_Student obj = new B_Student();
		obj.total = 2000;
		obj.male = 1200;  
		obj.fem = 800; 
		obj.Total();
		obj.MaleStu(); 
		obj.FemaleStu();
		
		System.out.println(" ");
		System.out.println("Staff Information");
		C_Staff sc = new C_Staff(); 
		sc.total = 57;
		sc.male = 25;  
		sc.fem = 32; 
		sc.Total();
		sc.MaleSta(); 
		sc.FemaleSta();
		
		

	}
}
