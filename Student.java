import java.util.*;
public class Student {
	int id;
	String name;
	int marks;
	
	Student(int id,String name,int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public static void main(String[] args){
		List<Student> lst = new ArrayList<>();
		
		lst.add(new Student(101,"Ravi",20));
		lst.add(new Student(102,"Ravi",19));
		lst.add(new Student(103,"Raju",18));
		lst.add(new Student(104,"Ramesh",17));
		System.out.println(lst);
		lst.set(2,new Student(103,"Ragu",6));
		System.out.println(lst);
		lst.remove(1);
		System.out.println(lst);
		System.out.println(lst.size());
		System.out.println(lst.contains("Ragu"));
		int i =0;
		for(Student s : lst){
			
			Student st = lst.get(i);
			System.out.println(st.name + " " + st.id + " " + st.marks);
			i++;
		}
	}
		}
		
