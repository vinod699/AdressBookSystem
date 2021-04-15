package addressbook;
import java.util.*;
public class Address_Book {
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
    public void details() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your details:");
        System.out.println("Enter your First Name: ");
        this.firstName = a.nextLine();

        Scanner b = new Scanner(System.in);
        System.out.println("Enter your Last Name: ");
        this.lastName = b.nextLine();

        Scanner c = new Scanner(System.in);
        System.out.println("Enter your Address: ");
        this.address = c.nextLine();

        Scanner d = new Scanner(System.in);
        System.out.println("City : ");
        this.city = d.nextLine();

        Scanner e = new Scanner(System.in);
        System.out.println("State : ");
        this.state = e.nextLine();

        Scanner f = new Scanner(System.in);
        System.out.println("Zip Code: ");
        this.zipCode = f.nextLong();

        Scanner g = new Scanner(System.in);
        System.out.println("Phone Number: ");
        this.phoneNumber = g.nextLong();

        Scanner h = new Scanner(System.in);
        System.out.println("Email Id : ");
        this.email = h.next();

    }

    public void editDetails() {

        System.out.println("Which details you want to edit");
        System.out.println("Press 1 for Name\n 2 Address\n 3 City\n 4 State\n 5 Zip Code\n 6 Phone Number\n 7 Email Id\n 8 Exit ");
        Scanner edit_obj = new Scanner(System.in);
        int edit = edit_obj.nextInt();
        switch (edit) {
            case 1:
                System.out.println("Press 1 to edit your Firstname\n press 2 to LastName\n press 0 for exit");
                Scanner input1 = new Scanner(System.in);
                int option1 = input1.nextInt();
                switch (option1) {
                    case 1:
                        Scanner input2 = new Scanner(System.in);
                        System.out.println("Enter the first Name");
                        String edit_firstName = input2.nextLine();
                        this.firstName = edit_firstName;
                        break;
                    case 2:
                        Scanner input3 = new Scanner(System.in);
                        System.out.println("Enter the Last Name");
                        String edit_lastName = input3.nextLine();
                        this.lastName = edit_lastName;
                        break;

                    default:
                        break;

                }
                break;

            case 2:
                Scanner input4 = new Scanner(System.in);
                System.out.println("Enter the Address");
                String edit_Address = input4.nextLine();
                this.address = edit_Address;
                break;

            case 3:
                Scanner input5 = new Scanner(System.in);
                System.out.println("Enter the City");
                String edit_City = input5.nextLine();
                this.city = edit_City;
                break;

            case 4:
                Scanner input6 = new Scanner(System.in);
                System.out.println("Enter the State");
                String edit_State = input6.nextLine();
                this.state = edit_State;
                break;

            case 5:
                Scanner input7 = new Scanner(System.in);
                System.out.println("Enter the Zip Code");
                long edit_ZipCode = input7.nextLong();
                this.zipCode = edit_ZipCode;
                break;

            case 6:
                Scanner input8 = new Scanner(System.in);
                System.out.println("Enter the Phone number");
                long edit_phoneNumber = input8.nextLong();
                this.phoneNumber = edit_phoneNumber;
                break;

            case 7:
                Scanner input9 = new Scanner(System.in);
                System.out.println("Enter the Email");
                String edit_Email = input9.nextLine();
                this.email = edit_Email;
                break;

            default:
                break;
        }
    }


    //method to return the date
    public String toString() {
        return ("Your Entered Details Are\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAddress: " + address + "\nCity: " + city + "\nState: " + state + "\nZip Code: " + zipCode + "\nPhone Number :" + phoneNumber + "\nEmail: " + email + "\n");

    }

    public String getName() {
        return firstName;
    }

    //main method
    public static void main(String args[]) {
        System.out.println("Welcome to Address Book Program");
        System.out.println("Choose the Address Book to add your details");
        System.out.println("Press 1 for Address_Book1\n Press 2 for Address_Book2\n 3 for exit");
        Scanner add = new Scanner(System.in);
        int op = add.nextInt();
        ArrayList<Address_Book> list = new ArrayList<>();//list object for the Array List
        ArrayList<Address_Book> list2 = new ArrayList<>();//list object for the Array List

        switch (op) {
            case 1: //Address Book 1 objects
                Address_Book person1 = new Address_Book();
                Address_Book person2 = new Address_Book();
                Address_Book person3 = new Address_Book();
                Address_Book person4 = new Address_Book();


                //for adding the contacts
                Scanner i = new Scanner(System.in);
                System.out.println("Press 1 to Enter the contact details\nPress 2 for exit");
                int opti = i.nextInt();
                switch (opti) {
                    case 1://adding person 1
                        person1.details();//calling the details method using the object
                        list.add(person1);//adding the details to the ArrayList
                        System.out.println(person1.toString());//calling the toString method


                        Scanner j = new Scanner(System.in);
                        System.out.println("Press 1 for adding another details\nPress 2 for exit");

                        int optj = j.nextInt();
                        switch (optj) {
                            case 1: //adding person 2
                                person2.details();
                                list.add(person2);
                                System.out.println(person2.toString());
                                Scanner k = new Scanner(System.in);
                                System.out.println("Press 1 for adding another details\nPress 2 for exit");
                                int optk = k.nextInt();
                                switch (optk) {
                                    case 1://adding person 3
                                        person3.details();
                                        list.add(person3);
                                        System.out.println(person3.toString());
                                        System.out.println("Press 1 for adding another details\nPress 2 for exit");
                                        Scanner l = new Scanner(System.in);
                                        int optl = l.nextInt();
                                        switch (optl) {
                                            case 1: //adding person 4
                                                person4.details();
                                                list.add(person4);
                                                System.out.println(person4.toString());
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
                Scanner n = new Scanner(System.in);
                int optn = n.nextInt();
                switch (optn) {
                    case 1://editing the details
                        System.out.println("Enter the first name of the contact you want to edit");
                        Scanner m = new Scanner(System.in);
                        String optm = m.nextLine();
                        if (person1.getName().equals(optm))//for editing person 1 using name
                        {
                            person1.editDetails();
                            person1.toString();
                            list.set(0, person1);
                            System.out.println(person1.toString());
                        } else if (person1.getName().equals(optm))//for editing person 2 using name
                        {
                            person2.editDetails();
                            person2.toString();
                            list.set(1, person2);
                            System.out.println(person2.toString());
                        } else if (person3.getName().equals(optm))//for editing person 3 using name
                        {
                            person3.editDetails();
                            person3.toString();
                            list.set(2, person3);
                            System.out.println(person3.toString());
                        } else if (person4.getName().equals(optm))//for editing person 4 using name
                        {
                            person4.editDetails();
                            person4.toString();
                            list.set(3, person4);
                            System.out.println(person4.toString());
                        } else {
                            break;
                        }
                        break;

                    default:
                        break;
                }

                //for deleting a provided contact
                System.out.println("Press 1 for deleting a particular contact\n Press 2 for exit");
                Scanner delete = new Scanner(System.in);
                int deletion = delete.nextInt();
                switch (deletion) {
                    case 1:
                        System.out.println("Enter the first name of the contact for deletion\n or press exit for exit");
                        Scanner del = new Scanner(System.in);
                        String dele = del.nextLine();

                        if (person1.getName().equals(dele)) {
                            list.remove(person1);
                        } else if (person2.getName().equals(dele)) {
                            list.remove(person2);
                        } else if (person3.getName().equals(dele)) {
                            list.remove(person3);
                        } else if (person4.getName().equals(dele)) {
                            list.remove(person4);
                        } else {
                            break;
                        }

                    default:
                        break;
                }

                System.out.println("Contacts in Address Book 1");
                for (int count = 0; count < list.size(); count++) {

                    System.out.println(list.get(count));
                }

                break;//case 1 break;

            case 2://///Address book 2

                //Address Book 2 objects
                Address_Book person5 = new Address_Book();
                Address_Book person6 = new Address_Book();
                Address_Book person7 = new Address_Book();
                Address_Book person8 = new Address_Book();


                //for adding the contacts
                Scanner i1 = new Scanner(System.in);
                System.out.println("Press 1 to Enter the contact details\nPress 2 for exit");
                int opti1 = i1.nextInt();
                switch (opti1) {
                    case 1://adding person 5
                        person5.details();//calling the details method using the object
                        list2.add(person5);//adding the details to the ArrayList
                        System.out.println(person5.toString());//calling the toString method


                        Scanner j1 = new Scanner(System.in);
                        System.out.println("Press 1 for adding another details\nPress 2 for exit");

                        int optj1 = j1.nextInt();
                        switch (optj1) {
                            case 1: //adding person 6
                                person6.details();
                                list2.add(person6);
                                System.out.println(person6.toString());
                                Scanner k1 = new Scanner(System.in);
                                System.out.println("Press 1 for adding another details\nPress 2 for exit");
                                int optk1 = k1.nextInt();
                                switch (optk1) {
                                    case 1://adding person 7
                                        person7.details();
                                        list2.add(person7);
                                        System.out.println(person7.toString());
                                        System.out.println("Press 1 for adding another details\nPress 2 for exit");
                                        Scanner l1 = new Scanner(System.in);
                                        int optl1 = l1.nextInt();
                                        switch (optl1) {
                                            case 1: //adding person 8
                                                person8.details();
                                                list2.add(person8);
                                                System.out.println(person8.toString());
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
                Scanner n1 = new Scanner(System.in);
                int optn1 = n1.nextInt();
                switch (optn1) {
                    case 1://editing the details
                        System.out.println("Enter the first name of the contact you want to edit");
                        Scanner m1 = new Scanner(System.in);
                        String optm1 = m1.nextLine();
                        if (person5.getName().equals(optm1))//for editing person 5 using name
                        {
                            person5.editDetails();
                            person5.toString();
                            list2.set(0, person5);
                            System.out.println(person5.toString());
                        } else if (person6.getName().equals(optm1))//for editing person 6 using name
                        {
                            person6.editDetails();
                            person6.toString();
                            list2.set(1, person6);
                            System.out.println(person6.toString());
                        } else if (person7.getName().equals(optm1))//for editing person 7 using name
                        {
                            person7.editDetails();
                            person7.toString();
                            list2.set(2, person7);
                            System.out.println(person7.toString());
                        } else if (person8.getName().equals(optm1))//for editing person 8 using name
                        {
                            person8.editDetails();
                            person8.toString();
                            list2.set(3, person8);
                            System.out.println(person8.toString());
                        } else {
                            break;
                        }
                        break;

                    default:
                        break;
                }

                //for deleting a provided contact
                System.out.println("Press 1 for deleting a particular contact\n Press 2 for exit");
                Scanner delete1 = new Scanner(System.in);
                int deletion1 = delete1.nextInt();
                switch (deletion1) {
                    case 1:
                        System.out.println("Enter the first name of the contact for deletion\n or press exit for exit");
                        Scanner del1 = new Scanner(System.in);
                        String dele1 = del1.nextLine();

                        if (person5.getName().equals(dele1)) {
                            list2.remove(person5);
                        } else if (person6.getName().equals(dele1)) {
                            list2.remove(person6);
                        } else if (person7.getName().equals(dele1)) {
                            list2.remove(person7);
                        } else if (person8.getName().equals(dele1)) {
                            list2.remove(person8);
                        } else {
                            break;
                        }

                    default:
                        break;
                }
                System.out.println("Contacts in Address Book2");
                for (int count1 = 0; count1 < list2.size(); count1++) {
                    System.out.println(list2.get(count1));
                }
                break;//case 2 break

            default:
                break;
        }

    }
}