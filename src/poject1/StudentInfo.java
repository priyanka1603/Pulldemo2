package poject1;

public class StudentInfo extends Student_Details {
	
	public void studentClass () {
		System.out.println("Student class is 12");
	}
	public static void main(String[] args) {
		StudentInfo w = new StudentInfo ();
		w.StudentName();
		w.studentAge();
		w.studentId();
		w.studentClass();
		w.studentGrade();
				
	}

}
