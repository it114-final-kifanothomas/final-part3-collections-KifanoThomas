package section1;

public class Student implements Comparable<Student>
{
	private String name;
	private Integer age;
	private Integer grade;
	private Double average;
	/**
	 * 
	 */
	public Student(String _name, Integer _age, Integer _grade, Double _average) 
	{
		name = _name;
		age = _age;
		grade = _grade;
		average = _average;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Student age) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
