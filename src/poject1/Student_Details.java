package poject1;


public class Student_Details extends student {
	 //parent class practice
	public void studentGrade () {
		 System.out.println("Student grade is A"); }
		 
		 public void studentAge () {
			 System.out.println("Student age is 22");
		 }
 
	
	public static void main(String[] args) {
		Student_Details ed = new Student_Details ();
		ed.studentGrade();
		ed.StudentName();
		ed.studentId();
		ed.studentAge();
	} 
         
}
