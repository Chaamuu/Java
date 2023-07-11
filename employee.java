package p1;
class employee{
public static void main(String[] args) {
Staff staffObj = new Staff("Manager");
staffObj.staff("John Doe", "123 Main St", "1234567890", "johndoe@example.com",
"Manager");
Student_Op studentObj = new Student_Op("USN123", "Computer Science");
studentObj.student("Jane Smith", "456 Elm St", "9876543210", "janesmith@example.com",
"USN123", "Computer Science");
double salary = staffObj.calculateSalary();
System.out.println("Calculated Salary: $" + salary);
double fees = studentObj.calculateFees();
System.out.println("Calculated Fees: $" +fees);
}
}
