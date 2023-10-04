package B_Parameters;

public class ParametersHW {

	int Add(int a, int b, int c) {
		System.out.print("Addition Value is: ");
		return a+b+c;
	}
	
	int Multiply (int d, int e) {
		System.out.print("Multipled Value is: ");
		return d*e;
	}
	
	void Remainder (int f, int g) {
		System.out.println("Remainder Value is: " + f%g);
	}
	
	public static void main(String[] args) {
		ParametersHW obj= new ParametersHW(); 
		System.out.println(obj.Add(10, 13, 3)); //<--- goes into sysout bc it is a "int" method
		System.out.println(obj.Multiply(3,2));
		obj.Remainder(75, 6); //<---- no sysout bc this is a "void" method 

	}
}
