//student class
package p1;
interface Student {
void student(String name, String address, String phoneNumber, String emailId, String
usn, String branch);
}
class Student_Op implements Student {
private String usn;
private String branch;
public Student_Op(String usn, String branch) {
this.usn = usn;
this.branch = branch;
}
@Override
public void student(String name, String address, String phoneNumber, String emailId,
String usn, String branch) {
person student = new person(name, address, phoneNumber, emailId);
System.out.println("Student information updated successfully.");
System.out.println("Student Information:");
student.displayInformation();
System.out.println("USN: " + this.usn);
System.out.println("Branch: " + this.branch);
System.out.println();
}
protected double calculateFees() {
if (branch.equals("Computer Science")) {
return 4000.0;
} else if (branch.equals("Electrical Engineering")) {
return 2000.0;
} else {
return 0.0;
}
}
}
