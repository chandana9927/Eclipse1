package a1;
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
	public String toString() {
		return this.mobile_cost + " " + this.mobile_name + " " + this.mobile_color;
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
	public String toString() {
		return this.car_cost + " " + this.car_model_name + " " + this.car_type;
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
	public String toString() {
		return this.school_name + " " + this.school_strength + " " + this.school_grade;
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
	public String toString() {
		return this.tv_cost + " " + this.tv_brand + " " + this.tv_type;
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
	public String toString() {
		return this.bike_cost + " " + this.bike_brand + " " + this.bike_color;
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
	public String toString() {
		return this.exam_cost + " " + this.course_name + " " + this.unvr_name;
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
	public String toString() {
		return this.laptop_cost + " " + this.laptop_name + " " + this.laptop_brand;
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
	public String toString() {
		return this.home_cost + " " + this.home_name + " " + this.home_color;
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
	public String toString() {
		return this.emp_id + " " + this.emp_sal + " " + this.emp_grade;
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
	public String toString() {
		return this.cloth_cost + " " + this.cloth_color + " " + this.cloth_size;
	}
}


public class Constructors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile(12000, "Samsung", "Metallic Gray");
		System.out.println(m1.toString());
		
		Car c1 = new Car(134500, "Maruti Suzuki", "Petrol");
		System.out.println(c1);
		
		School s1 = new School(32, "New Horizon School", 'A');
		System.out.println(s1.toString());
		
		TV t1 = new TV(120000, "Samsung", "Smart LCD TV");
		System.out.println(t1.toString());
		
		Bike b1 = new Bike(140000, "Honda Splender", "Blue");
		System.out.println(b1.toString());
		
		Course co1 = new Course(990, "BCA", "UOM");
		System.out.println(co1.toString());
		
		Laptop l1 = new Laptop(104500, "HP", "Pavillion x360");
		System.out.println(l1.toString());
		
		Home h1 = new Home(7600000, "Shanti Nivas", "Gray");
		System.out.println(h1.toString());
		
		Employee e1 = new Employee(101, 35000, 'A');
		System.out.println(e1.toString());
		
		Cloth cl1 = new Cloth(500, "XL", "Fuchsia");
		System.out.println(cl1.toString());
		
		Constructors con1 = new Constructors();
		System.out.println(con1);
		
		

	}

}
