class Person{
	String name;
	int rollNo;
	
	Person(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
}

class Employee{
	String name;
	int age;
	
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void employeeDetails(){
		System.out.println("Name - " + name + "\nAge - " + age);
	}
}


class Student{
	String name;
	int age; 
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void studentDetails(){
		System.out.println("Name - " + name + "\nAge - " + age);
	}
}


public class UnderstandingArrays{
	
	public static void main(String[] args){
		
		Student st1 = new Student("Swapneel" , 34);
		Student st2 = new Student("Shiva" , 24);
		// st1.studentDetails();		// prints only st1 details
		
		// Calling instance variable
		Student[] student_array = {st1, st2};
		System.out.println("===== Student Details For loop! =====");
		for(int i = 0; i < student_array.length; i++){
			student_array[i].studentDetails();
		}
		
		System.out.println("===== Student Details For_Each loop! =====");
		for(Student st : student_array){
			st.studentDetails();
		}
		
		System.out.println("===== Student Name & Age For loop! =====");
		for(int i = 0; i < student_array.length; i++){
			System.out.println("Student Name - " + student_array[i].name + " Student Age - " + student_array[i].age);
		}
		
		
		// Declration and Initialization
		Employee emp1 = new Employee("Prasad", 45);
		Employee emp2 = new Employee("Vaibhav", 23);
		
		Employee[] employee_array = new Employee[2];
		employee_array[0] = emp1;
		employee_array[1] = emp2;
		
		System.out.println("===== Employee Details (For Loop) =====");
        for (int i = 0; i < employee_array.length; i++) {
            employee_array[i].employeeDetails();
        }
		
		System.out.println("===== Employee Details (For-Each Loop) =====");
		for(Employee emp : employee_array){
			emp.employeeDetails();
		}
		
		Person p1 = new Person("Abhishek", 100);
		Person p2 = new Person("Ajinkya", 200);
		Person[] person_array = new Person[2];
		
		person_array[0] = p1;
		person_array[1] = p2;
		
		System.out.println("===== Person Details (For Loop) =====");
		for(int i = 0; i < person_array.length; i++){
			System.out.println("Person name - " + person_array[i].name + " Person RollNo - " + person_array[i].rollNo);
		}
		
		System.out.println("===== Person Details (For_each Loop) =====");
		for(Person p : person_array){
			System.out.println("Person name - " + p.name + " Person RollNo - " + p.rollNo);
		}
		
		
		// Store elements in an array
		String name = "Rani";
		int age = 10;
		int sub1 = 89, sub2 = 90, sub3 = 78;	
		
		
		// Ways of declaring arrays
		
		// DataType[] variable_name = new DataType[]
		int[] marks = new int[3];
		// Initialization
		marks[0] = 97;
		marks[1] = 78;
		marks[2] = 90;
		
		// Declration and Initialization
		int[] mark2 = {78, 89, 90,67};		// Memory allocation - 16 bytes (4 bytes for elements)
		
		String[] subjects = {"Swapneel", "Ram", "Siya", "Sham"};
		System.out.println("subjects[0]: " + subjects[0]);
		System.out.println("subjects[2]: " + subjects[2]);
		System.out.println("subjects length: " + subjects.length);
		System.out.println("mark2 length: "+ mark2.length);
		System.out.println("Last element in an array: " + subjects[subjects.length-1]);

		
		// loops - iterate through array
		for(int i = 0; i < mark2.length; i++){
			System.out.println(mark2[i]);
		}
		
		// Enhanced loop (For_Each loop)
		for(int m : mark2){
			System.out.print("Marks: " + m + " ");
		}
		
		// Object array can hold multiple data types
		System.out.println("\n===== Object Array Demo: Object array can hold multiple data types =====");
		Object[] data = {1, 3, 4, "Hello", false, 3.0};
		for (Object ob : data) {
			System.out.println("Value: " + ob + " (Type: " + ob.getClass().getSimpleName() + ")");
		}
		
		// Passing Array to Method
		int[] numbers = new int[4];		// Default values will be 0
		printArray(numbers);		// Passing array to method
		
		System.out.println();
		// Getting array from method
		int[] new_array = getValue();
		for(int result : new_array){
			System.out.print(result + " ");
		}
	}
	
	// Method to print array elements
	public static void printArray(int[] arr){
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
	
	// Method that returns an array
	public static int[] getValue(){
		int[] newArray = new int[3];
		return newArray;
	}
	
}