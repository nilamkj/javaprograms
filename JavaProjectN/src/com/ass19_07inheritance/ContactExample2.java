package com.ass19_07inheritance;
//2.	Implement the inheritance as shown in below diagram. Use appropriate setter/getter and
//constructor to initialize the access the values. Use “super” keyword to initialize the Contact class
//properties. Also provide a method printContact() to print the contact detail in Contact class and override 
//the same method according to CompanyContact and EmployeeContact.

class Contact
{
	String contactPerson;
	long mobile;
	String email;
	
	Contact(){
		
	}
	public Contact(String contactPerson, long mobile,String email)
	{
		this.contactPerson=contactPerson;
		this.mobile=mobile;
		this.email=email;
	}
	public void printContact()
	{
		System.out.println("Contact Person= "+contactPerson);
		System.out.println("Mobile No= "+mobile);
		System.out.println("Email= "+email);
	}
	
}
class CompanyContact extends Contact
{
	String companyName;
	String website;
	String department;
	String city;
	String country;
	String address;
	int pin;
	
	public CompanyContact(String contactPerson, long mobile,String email,String companyName,String website,String department,String city,String country,String address,int pin)
	{
		super(contactPerson,mobile,email);
		this.companyName=companyName;
		this.website=website;
		this.department=department;
		this.city=city;
		this.country=country;
		this.address=address;
		this.pin=pin;
	}
	public void printContact()
	{
		
		System.out.println("-------------------");
		super.printContact();
		System.out.println("Company Name: "+companyName);
		System.out.println("Website: "+website);
		System.out.println("Department: "+department);
		System.out.println("City: "+city);
		System.out.println("Country: "+country);
		System.out.println("Address: "+address);
		System.out.println("Pin: "+pin);

	}
}
class EmployeeContact extends Contact
{
	String city;
	String country;
	int pin;
	String designation;
	String dateOfBirth;
	
	public EmployeeContact(String contactPerson,long mobile,String email,String city,String country,int pin,String designation,String dateOfBirth)
	{
		super(contactPerson,mobile,email);
		this.city=city;
		this.country=country;
		this.pin=pin;
		this.designation=designation;
		this.dateOfBirth=dateOfBirth;
	}
	public void printContact()
	{
		System.out.println("-------------------");
		super.printContact();
		System.out.println("City: "+city);
		System.out.println("Country: "+country);
		System.out.println("Pin: "+pin);
		System.out.println("designation: "+designation);
		System.out.println("Date of Birth: "+dateOfBirth);
	}
}
public class ContactExample2 {

	public static void main(String[] args) {
		Contact c1=new Contact("Anaya",7455478781l,"anaya@gmail.com");
		c1.printContact();
		
		CompanyContact co1=new CompanyContact("Raksha",6783994723l,"raksha@gmail.com","TCS","tcs.com","Software Developer","Pune","India","Vimannagar",411006);
		co1.printContact();
		
		EmployeeContact ec=new EmployeeContact("Mina",8965472976l,"mina@gmail.com","Sangli","India",410675,"Tester","07/12/1995");
		ec.printContact();
	}

}
