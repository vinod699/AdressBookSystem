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

    public void editDetails()
    {

        System.out.println("Which details you want to edit");
        System.out.println("Press 1 for Name\n 2 Address\n 3 City\n 4 State\n 5 Zip Code\n 6 Phone Number\n 7 Email Id\n 8 Exit ");
        Scanner edit_obj=new Scanner(System.in);
        int edit=edit_obj.nextInt();
        switch(edit)
        {
            case 1:
                System.out.println("Press 1 to edit your Firstname\n press 2 to LastName\n press 0 for exit");
                Scanner input1=new Scanner(System.in);
                int option1=input1.nextInt();
                switch(option1)
                {
                    case 1:
                        Scanner input2=new Scanner(System.in);
                        System.out.println("Enter the first Name");
                        String edit_firstName=input2.nextLine();
                        this.firstName=edit_firstName;
                        break;
                    case 2:
                        Scanner input3=new Scanner(System.in);
                        System.out.println("Enter the Last Name");
                        String edit_lastName=input3.nextLine();
                        this.lastName=edit_lastName;
                        break;

                    default:
                        break;

                }
                break;

            case 2:
                Scanner input4=new Scanner(System.in);
                System.out.println("Enter the Address");
                String edit_Address=input4.nextLine();
                this.address=edit_Address;
                break;

            case 3:
                Scanner input5=new Scanner(System.in);
                System.out.println("Enter the City");
                String edit_City=input5.nextLine();
                this.city=edit_City;
                break;

            case 4:
                Scanner input6=new Scanner(System.in);
                System.out.println("Enter the State");
                String edit_State=input6.nextLine();
                this.state=edit_State;
                break;

            case 5:
                Scanner input7=new Scanner(System.in);
                System.out.println("Enter the Zip Code");
                long edit_ZipCode=input7.nextLong();
                this.zipCode=edit_ZipCode;
                break;

            case 6:
                Scanner input8=new Scanner(System.in);
                System.out.println("Enter the Phone number");
                long edit_phoneNumber=input8.nextLong();
                this.phoneNumber=edit_phoneNumber;
                break;

            case 7:
                Scanner input9=new Scanner(System.in);
                System.out.println("Enter the Email");
                String edit_Email=input9.nextLine();
                this.email=edit_Email;
                break;

            default:
                break;
        }
    }


    //method to return the date
    public String toString()
    {
        return ("Your Entered Details Are\nFirst Name: "+firstName+"\nLast Name: "+lastName+"\nAddress: "+address+"\nCity: "+city+"\nState: "+state+"\nZip Code: "+zipCode+"\nPhone Number :"+phoneNumber+"\nEmail: "+email+"\n");

    }

    public String getName()
    {
        return firstName;
    }

    //main method
    public static void main(String args[])
    {
        System.out.println("Welcome to Address Book Program");

        ArrayList<Address_Book> list=new ArrayList<>();//list object for the Array List
        Address_Book person1=new Address_Book();
        Address_Book person2=new Address_Book();
        Address_Book person3=new Address_Book();
        Address_Book person4=new Address_Book();

        //for adding the contacts
        Scanner i=new Scanner(System.in);
        System.out.println("Press 1 to Enter the contact details\nPress 2 for exit");
        int opti=i.nextInt();
        switch(opti)
        {
            case 1://adding person 1
                person1.details();//calling the details method using the object
                System.out.println(person1.toString());//calling the toString method
                list.add(person1);//adding the details to the ArrayList

                Scanner j=new Scanner(System.in);
                System.out.println("Press 1 for adding another details\nPress 2 for exit");

                int optj=j.nextInt();
                switch(optj)
                {
                    case 1: //adding person 2
                        person2.details();
                        list.add(person2);
                        Scanner k=new Scanner(System.in);
                        System.out.println("Press 1 for adding another details\nPress 2 for exit");
                        int optk=k.nextInt();
                        switch(optk)
                        {
                            case 1://adding person 3
                                person3.details();
                                list.add(person3);
                                System.out.println("Press 1 for adding another details\nPress 2 for exit");
                                Scanner l=new Scanner(System.in);
                                int optl=l.nextInt();
                                switch(optl)
                                {
                                    case 1: //adding person 4
                                        person4.details();
                                        list.add(person4);
                                        break;
                                    default:
                                        break;
                                }
                                break;

                            default:
                                break;
                        }
                        break;

                    default:
                        break;
                }
            default:
                break;
        }

        //for editing
        System.out.println("Press 1 for editing the details\nPress 2 for exit");
        Scanner n=new Scanner(System.in);
        int optn=n.nextInt();
        switch(optn)
        {
            case 1://editing the details
                System.out.println("Enter the first name of the contact you want to edit");
                Scanner m=new Scanner(System.in);
                String optm=m.nextLine();
                if(person1.getName().equals(optm))//for editing person 1 using name
                {
                    person1.editDetails();
                    person1.toString();
                    list.set(0, person1);
                }
                else if(person1.getName().equals(optm))//for editing person 2 using name
                {
                    person2.editDetails();
                    person2.toString();
                    list.set(1, person2);
                }
                else if(person3.getName().equals(optm))//for editing person 3 using name
                {
                    person3.editDetails();
                    person3.toString();
                    list.set(2, person3);
                }
                else if(person4.getName().equals(optm))//for editing person 4 using name
                {
                    person4.editDetails();
                    person4.toString();
                    list.set(3, person4);
                }
                else {
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