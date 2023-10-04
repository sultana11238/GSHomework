package A_Objects;


public class ObjectsHW {

		void WeekendOrWeekday(String day) {
			if (day == "Saturday") {
				System.out.println("Weekend");
			}
			else if (day == "Sunday") {
				System.out.println("Weekend");
				}
			else  {
				System.out.println("Weekday");
				}
		}

		public static void main(String[] args) {
			ObjectsHW obj = new ObjectsHW (); 
			obj.WeekendOrWeekday("Saturday");
			obj.WeekendOrWeekday("Sunday");
			obj.WeekendOrWeekday("Monday");
			obj.WeekendOrWeekday("Tuesday");
			
			//HW Prompt:
			// you should create a Method (WeekendOrWeekday) which will receive one parameter(day). 
			//If the day is Saturday Or Sunday, it will print Weekend Otherwise week days.You must need to  use object for accessing method.

		}
}
