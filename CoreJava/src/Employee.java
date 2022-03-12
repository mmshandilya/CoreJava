import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Employee {

	private int id;
	private String name;
	private int salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee()
	{
		
	}
	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public static void main(String args[])
	{
		Employee emp=new Employee();
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"Mahesh",10000));
		list.add(new Employee(2,"Praveen",20000));
		list.add(new Employee(3,"Sharad",30000));
		/*
		 * for(Employee e:list) { if(e.getSalary()>10000)
		 * System.out.println(""+e.getName()); }
		 */
		/*
		 * list.stream().forEach(person->{ if(person.salary>10000) {
		 * System.out.println(""+person.name); } });
		 */
		//list.stream().filter(person->person.getSalary()>10000).forEach(person->System.out.println(person.getName()));
		Map <Integer,Employee> map=new HashMap();
		map.put(10, new Employee(1,"Mahesh",10000));
		map.put(10, new Employee(1,"Mahesh",10000));
		map.put(20, new Employee(2,"Praveen",20000));
		map.put(30, new Employee(3,"Sharad",30000));
		
		//map.forEach((key,value)->System.out.println(""+value.getName()+" : "+value.getSalary()));
			
		Set<Employee> set=new HashSet<>();
		
		
		set.add(new Employee(1,"Mahesh",10000)); 
		set.add(new Employee(1,"Mahesh",10000)); 
		set.add(new Employee(2,"Praveen",20000));
		set.add(new Employee(3,"Sharad",30000));
		  
		set.forEach(person->System.out.println(""+person.getName()+" : "+person.getSalary()+" : "+person.hashCode()));
		 
		
		Set<String> set1=new HashSet<>(); set1.add("1"); set1.add("1"); set1.add("2");
		for(String s:set1)
		{
			System.out.println(""+s);
		}	
		
	}
	
	
}
