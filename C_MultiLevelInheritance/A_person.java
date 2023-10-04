package C_MultiLevelInheritance;


public class A_person {
	
	A_person (String name){
		System.out.println(name.toUpperCase()+":");
	} //<-- bc there is a constructor here the inheritance has an extra rule	
	
	public static void main(String[] args) {
		A_person  obj = new A_person ("Student Information"); 
		

	}
}
