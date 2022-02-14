public class Course{
	String name;
	int credits;
	String grade;
	public Course(String name, int credits, String grade){
		this.name = name;
		this.credits = credits;
		this.grade = grade;
		}
	public String returnName(){
		return name;
	}
	public int returnCredits(){
		return credits;
	}
	public String returnGrade(){
		return grade;
	}
}
