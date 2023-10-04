package C_MultiLevelInheritance;

public class D_Main {
	// since he are not inheriting a class here, all we need is an object that calls the class we
	// want to connect to (collegestudent) then everything inherited by "cs" can be called here
		
		
		public static void main(String[] args) {
			C_collegestudent lo = new C_collegestudent("Student Information"); 
			lo.studentage = 21;
			lo.StudentInfo("Johnthan Piker", 245989542);
			lo.major = "Poli Sci"; 
			lo.show();
		}
			
}
