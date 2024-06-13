
public class Student {
	int id;
	String name;
	Float marks;
	long fee;
	public Student(int id, String name, double d,long fee) {
		this.id = id;
		this.name = name;
		this.marks = (float) d;
		this.fee=fee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getMarks() {
		return marks;
	}
	public void setMarks(Float marks) {
		this.marks = marks;
	}
	public long getFee() {
		return fee;
	}
	public void setFee(long fee) {
		this.fee = fee;
	}
	
	
	

}
