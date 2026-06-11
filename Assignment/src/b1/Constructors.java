package b1;

//1
class Mobile{
	int mobile_cost;
	String mobile_name;
	String mobile_color;
	Mobile(int mobile_cost, String mobile_name, String mobile_color){
		this.mobile_cost = mobile_cost;
		this.mobile_name = mobile_name;
		this.mobile_color = mobile_color;
	}
	public boolean equals(Object obj) {
		Mobile m2 = (Mobile) obj;
		return this.mobile_cost == m2.mobile_cost;
	}
}
//2
class Car{
	int car_cost;
	String car_model_name;
	String car_type;
	Car(int car_cost, String car_model_name, String car_type){
		this.car_cost = car_cost;
		this.car_model_name = car_model_name;
		this.car_type = car_type;
	}
	public boolean equals(Object obj) {
		Car c2 = (Car) obj;
		return this.car_cost == c2.car_cost;
	}
}
//3
class School{
	int school_strength;
	String school_name;
	char school_grade;
	School(int school_strength, String school_name, char school_grade){
		this.school_strength = school_strength;
		this.school_name = school_name;
		this.school_grade = school_grade;
	}
	public boolean equals(Object obj) {
		School s2 = (School) obj;
		return this.school_grade == s2.school_grade;
	}
}
//4
class TV{
	int tv_cost;
	String tv_brand;
	String tv_type;
	TV(int tv_cost, String tv_brand, String tv_type){
		this.tv_cost = tv_cost;
		this.tv_brand = tv_brand;
		this.tv_type = tv_type;
	}
	public boolean equals(Object obj) {
		TV t2 = (TV) obj;
		return this.tv_cost == t2.tv_cost;
	}
}
//5
class Bike{
	int bike_cost;
	String bike_brand;
	String bike_color;
	Bike(int bike_cost, String bike_brand, String bike_color){
		this.bike_cost = bike_cost;
		this.bike_brand = bike_brand;
		this.bike_color = bike_color;
	}
	public boolean equals(Object obj) {
		Bike b2 = (Bike) obj;
		return this.bike_cost == b2.bike_cost;
	}
}
//6
class Course{
	int exam_cost;
	String course_name;
	String unvr_name;
	Course(int exam_cost, String course_name, String unvr_name){
		this.exam_cost = exam_cost;
		this.course_name = course_name;
		this.unvr_name = unvr_name;
	}
	public boolean equals(Object obj) {
		Course co2 = (Course) obj;
		return this.exam_cost == co2.exam_cost;
	}
}
//7
class Laptop{
	int laptop_cost;
	String laptop_name;
	String laptop_brand;
	Laptop(int laptop_cost, String laptop_name, String laptop_brand){
		this.laptop_cost = laptop_cost;
		this.laptop_name = laptop_name;
		this.laptop_brand = laptop_brand;
	}
	public boolean equals(Object obj) {
		Laptop l2 = (Laptop) obj;
		return this.laptop_cost == l2.laptop_cost;
	}
}
//8
class Home{
	int home_cost;
	String home_name;
	String home_color;
	Home(int home_cost, String home_name, String home_color){
		this.home_cost = home_cost;
		this.home_name = home_name;
		this.home_color = home_color;
	}
	public boolean equals(Object obj) {
		Home h2 = (Home) obj;
		return this.home_cost == h2.home_cost;
	}
}
//9
class Employee{
	int emp_id;
	int emp_sal;
	char emp_grade;
	Employee(int emp_id, int emp_sal, char emp_grade){
		this.emp_id = emp_id;
		this.emp_sal = emp_sal;
		this.emp_grade = emp_grade;
	}
	public boolean equals(Object obj) {
		Employee e2 = (Employee) obj;
		return this.emp_grade == e2.emp_grade;
	}
}
//10
class Cloth{
	int cloth_cost;
	String cloth_size;
	String cloth_color;
	Cloth(int cloth_cost, String cloth_size, String cloth_color){
		this.cloth_cost = cloth_cost;
		this.cloth_size = cloth_size;
		this.cloth_color = cloth_color;
	}
	public boolean equals(Object obj) {
		Cloth col2 = (Cloth) obj;
		return this.cloth_cost == col2.cloth_cost;
	}
}


public class Constructors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile(12000, "Samsung", "Metallic Gray");
		Mobile m2 = new Mobile(22000, "Apple", "Titanium Blue");
		if(m1.equals(m2)) {
			System.out.println("Same");
			
		}
		else {
			System.out.println("different");
		}
		
		Car c1 = new Car(134500, "Maruti Suzuki", "Petrol");
		Car c2 = new Car(284500, "Audi", "Petrol");
		if(c1.equals(c2)) {
			System.out.println("Same");
			
		}
		else {
			System.out.println("different");
		}
		
		School s1 = new School(32, "New Horizon School", 'A');
		School s2 = new School(62, "Delhi Public School", 'A');
		if(s1.equals(s2)) {
			System.out.println("Same");
			
		}
		else {
			System.out.println("different");
		}
		
		TV t1 = new TV(120000, "Samsung", "Smart LCD TV");
		TV t2 = new TV(160000, "TCL", "Smart LCD TV");
		if(t1.equals(t2)) {
			System.out.println("Same");
			
		}
		else {
			System.out.println("different");
		}
		
		Bike b1 = new Bike(140000, "Honda Splender", "Blue");
		Bike b2 = new Bike(240000, "Hero", "Green");
		if(b1.equals(b2)) {
			System.out.println("Same");
			
		}
		else {
			System.out.println("different");
		}
		
		Course co1 = new Course(990, "BCA", "UOM");
		Course co2 = new Course(330, "MCA", "UOB");
		if(co1.equals(co2)) {
			System.out.println("Same");
			
		}
		else {
			System.out.println("different");
		}
		
		Laptop l1 = new Laptop(104500, "HP", "Pavillion x360");
		Laptop l2 = new Laptop(104500, "DELL", "Latitude");
		if(l1.equals(l2)) {
			System.out.println("Same");
			
		}
		else {
			System.out.println("different");
		}
		
		Home h1 = new Home(7600000, "Shanti Nivas", "Gray");
		Home h2 = new Home(5600000, "Shanti Niketan", "Cream");
		if(h1.equals(h2)) {
			System.out.println("Same");
			
		}
		else {
			System.out.println("different");
		}
		
		Employee e1 = new Employee(101, 35000, 'A');
		Employee e2 = new Employee(109, 55000, 'A');
		if(e1.equals(e2)) {
			System.out.println("Same");
			
		}
		else {
			System.out.println("different");
		}
		
		
		Cloth cl1 = new Cloth(500, "XL", "Fuchsia");
		Cloth cl2 = new Cloth(500, "XS", "Violet"
				+ "");
		if(cl1.equals(cl2)) {
			System.out.println("Same");
			
		}
		else {
			System.out.println("different");
		}
		
//		Constructors con1 = new Constructors();
//		System.out.println(con1);
		
		

	}

}
