package addressbook;

        import java.util.*;
public class Address_Book {
    //Variable
    static String firstName;
    static String lastName;
    static String city;
    static String state;
    static String address;
    static String email;
    static long zipCode;
    static long phoneNumber;

    //Constructor
    public Address_Book(String firstName, String lastName, String address, String city, String state, long phoneNumber, String email, long zipCode)
    {
        Address_Book.firstName=firstName;
        Address_Book.lastName=lastName;
        Address_Book.address=address;
        Address_Book.city=city;
        Address_Book.state=state;
        Address_Book.zipCode=zipCode;
        Address_Book.phoneNumber=phoneNumber;
        Address_Book.email=email;
    }

    //method to take input from the user
    public void details()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your details:");
        System.out.println("Enter your First Name: ");
        Address_Book.firstName=a.nextLine();

        Scanner b=new Scanner(System.in);
        System.out.println("Enter your Last Name: ");
        Address_Book.lastName=b.nextLine();

        Scanner c=new Scanner(System.in);
        System.out.println("Enter your Address: ");
        Address_Book.address=c.nextLine();

        Scanner d=new Scanner(System.in);
        System.out.println("City : ");
        Address_Book.city=d.nextLine();

        Scanner e=new Scanner(System.in);
        System.out.println("State : ");
        Address_Book.state=e.nextLine();

        Scanner f=new Scanner(System.in);
        System.out.println("Zip Code: ");
        Address_Book.zipCode =f.nextLong();

        Scanner g=new Scanner(System.in);
        System.out.println("Phone Number: ");
        Address_Book.phoneNumber =g.nextLong();

        Scanner h=new Scanner(System.in);
        System.out.println("Email Id : ");
        Address_Book.email=h.next();

    }

    //method to return the date
    public String toString()
    {
        return ("Your Entered Details Are\nFirst Name: "+firstName+"\nLast Name: "+lastName+"\nAddress: "+address+"\nCity: "+city+"\nState: "+state+"\nZip Code: "+zipCode+"\nPhone Number :"+phoneNumber+"\nEmail: "+email+"\n");

    }
    //main method
    public static void main(String args[])
    {
        System.out.println("Welcome to Address Book Program");

        List<Address_Book> list=new ArrayList<>();//list object for the Array List
        Address_Book person1=new Address_Book(firstName, lastName, address, city, state, zipCode,email,phoneNumber);


        Scanner i=new Scanner(System.in);
        System.out.println("Press 1 to Enter the contact details\nPress 2 for exit");
        int opti=i.nextInt();

        switch(opti)
        {
            case 1:
                person1.details();//calling the details method using the object
                person1.toString();//calling the toString method
                list.add(person1);//adding the details to the ArrayList
                System.out.println(list.get(0));//printing the list using index

            default:
                break;

        }

    }
}