package addressbook;
import java.util.*;
public class Address_Book{
    //Variable
    String firstName;
    String lastName;
    String city;
    String state;
    String address;
    String email;
    long zipCode;
    long phoneNumber;




    //method to take input from the user
    public void details()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your details:");
        System.out.println("Enter your First Name: ");
        this.firstName=a.nextLine();

        Scanner b=new Scanner(System.in);
        System.out.println("Enter your Last Name: ");
        this.lastName=b.nextLine();

        Scanner c=new Scanner(System.in);
        System.out.println("Enter your Address: ");
        this.address=c.nextLine();

        Scanner d=new Scanner(System.in);
        System.out.println("City : ");
        this.city=d.nextLine();

        Scanner e=new Scanner(System.in);
        System.out.println("State : ");
        this.state=e.nextLine();

        Scanner f=new Scanner(System.in);
        System.out.println("Zip Code: ");
        this.zipCode =f.nextLong();

        Scanner g=new Scanner(System.in);
        System.out.println("Phone Number: ");
        this.phoneNumber =g.nextLong();

        Scanner h=new Scanner(System.in);
        System.out.println("Email Id : ");
        this.email=h.next();

    }

    //method to return the data
    public String toString()
    {
        return ("Your Entered Details Are\nFirst Name: "+firstName+"\nLast Name: "+lastName+"\nAddress: "+address+"\nCity: "+city+"\nState: "+state+"\nZip Code: "+zipCode+"\nPhone Number :"+phoneNumber+"\nEmail: "+email+"\n");

    }
    //main method
    public static void main(String args[])
    {
        System.out.println("Welcome to Address Book Program");

        ArrayList<Address_Book> list=new ArrayList<>();//list object for the Array List
        Address_Book person1=new Address_Book();

        Scanner i=new Scanner(System.in);
        System.out.println("Press 1 to Enter the contact details\nPress 2 for exit");
        int opti=i.nextInt();


        switch(opti)
        {
            case 1:
                person1.details();//calling the details method using the object
                System.out.println(person1.toString());//calling the toString method
                list.add(person1);//adding the details to the ArrayList

                Scanner j=new Scanner(System.in);
                System.out.println("Press 1 for adding another details\nPress 2 for exit");

                int optj=j.nextInt();
                switch(optj)
                {
                    case 1:
                        Address_Book person2=new Address_Book();
                        person2.details();
                        list.add(person2);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;

        }

        for(int count=0;count<list.size();count++)
        {

            System.out.println(list.get(count));
        }

    }
}