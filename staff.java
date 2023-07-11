package p1;
interface Staff_Op {
void staff(String name, String address, String phoneNumber, String emailId, String
designation);
}
class Staff implements Staff_Op {
private String designation;
public Staff(String designation) {
this.designation = designation;
}
@Override
public void staff(String name, String address, String phoneNumber, String emailId,
String designation) {
person staff = new person(name, address, phoneNumber, emailId);
System.out.println("Staff information updated successfully.");
System.out.println("Staff Information:");
staff.displayInformation();
System.out.println("Designation: " + this.designation);
System.out.println();
}
double calculateSalary() {
if (designation.equals("Manager")) {
return 5000.0;
}
else if (designation.equals("Employee"))
{
return 3000.0;
}
else
{
return 0.0;
}
}
}
