package C_MultiLevelInheritance;

public class C_collegestudent extends B_student {
	
	C_collegestudent(String name) {
		super(name);
	}//<---- since we are pulling from a class that inherits a constructor (student) we
		// need a constructor here and use the same super for the original parameter

	String major; 
	
	void show () {
		System.out.println("Major" + " " + major);
	}
}
