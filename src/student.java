import java.util.*;
import java.io.*;


 
  public class student
	   {
	   

	   String firstName;
	   String lastName;
	   String class1;
	   static String grade1;
	   String class2;
	   static String grade2;
	   String class3;
	   static String grade3;
	   int GPA;
		   
		   student(String fn,  String ln,  String c1,  String g1,  String c2,  String g2,  String c3,  String g3, int gpa)
		   {
			    firstName = fn;
			    lastName = ln;
			    class1 = c1;
			    grade1 = g1;
			    class2 = c2;
			    grade2 = g2;
			    class3 = c3;
			    grade3 = g3;
			    GPA = gpa;
		   }
		   public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public String getClass1() {
				return class1;
			}

			public void setClass1(String class1) {
				this.class1 = class1;
			}

			public String getGrade1() {
				return grade1;
			}

			public void setGrade1(String grade1) {
				this.grade1 = grade1;
			}

			public String getClass2() {
				return class2;
			}

			public void setClass2(String class2) {
				this.class2 = class2;
			}

			public String getGrade2() {
				return grade2;
			}

			public void setGrade2(String grade2) {
				this.grade2 = grade2;
			}

			public String getClass3() {
				return class3;
			}

			public void setClass3(String class3) {
				this.class3 = class3;
			}

			public String getGrade3() {
				return grade3;
			}

			public void setGrade3(String grade3) {
				this.grade3 = grade3;
			}
			public int getGPA() {
				return GPA;
			}
			public void setGPA(int GPA) {
				this.GPA = GPA;
			}

	
 
   

   

}
