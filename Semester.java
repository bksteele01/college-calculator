import java.util.*;
public class Semester{
	Course course1;
	Course course2;
	Course course3;
	Course course4;
	Course course5;
	List<Course> semesterClasses = new ArrayList<>();
	public Semester(Course course1, Course course2, Course course3, Course course4, Course course5){
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.course4 = course4;
		this.course5 = course5;
		semesterClasses.add(course1);
		semesterClasses.add(course2);
		semesterClasses.add(course3);
		semesterClasses.add(course4);
		semesterClasses.add(course5);
	}
}
