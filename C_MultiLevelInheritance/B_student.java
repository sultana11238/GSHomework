package C_MultiLevelInheritance;

public class B_student extends A_person {
	
	B_student(String name) {
		super(name);
	} //<---- to extend a class with a constructor (student) you need one here too 
		//and need to add super to the parameter used in that constructor

	int studentage; 
	
	void StudentInfo (String Name, int Id){
		System.out.println("Name:" + " " + Name);
		System.out.println("ID #:" + " " + Id);
		System.out.println("Age:" + " " + studentage);
	}

}
