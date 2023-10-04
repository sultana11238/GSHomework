package B_SchoolManagement;
// School Management HW but using an inheritance example

public class E_Main_in extends B_Student {

	public static void main(String[] args) {
		E_Main_in obj = new E_Main_in(); //<--- the main difference in this code is creating a object 
		//for the this current class and not for the methods in the "School" class 
		obj.total = 150; 
		obj.male = 100; 
		obj.fem = 50;
		obj.Total();
		obj.MaleStu();
		obj.FemaleStu();
		

	}

}
