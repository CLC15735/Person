
public class person {
	private String name;
	private int age;
	private String jobtitle;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", jobtitle=" + jobtitle + "]";
	}
	
	

}
