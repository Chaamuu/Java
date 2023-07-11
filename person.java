package p1;
public class person {
protected String name;
protected String address;
protected String phoneNumber;
protected String emailId;
public person(String name, String address, String phoneNumber, String emailId) {
this.name = name;
this.address = address;
this.phoneNumber = phoneNumber;
this.emailId = emailId;
}
public void displayInformation() {
System.out.println("Name: " + name);
System.out.println("Address: " + address);
System.out.println("Phone Number: " + phoneNumber);
System.out.println("Email ID: " + emailId);
}
}
