import java.util.Comparator;

public class GPASorter implements Comparator<Student>
{


	public int compare(Student s1, Student s2) {
		return s1.getGPA().compareTo(s2.getGPA());
		//figure out how to calculate GPA
	}



}
