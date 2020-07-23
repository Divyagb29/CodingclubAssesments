package practiceproblems;

import java.io.*;
import java.util.*;

public class AddressBook {

    String first;
    String last;
    String homeadd;
    String homeph;
    String cellnum;

    public AddressBook(String firstName, String lastName, String homeAddress, String homePhone, String cellNumber) {
        first = firstName;
        last = lastName;
        homeadd = homeAddress;
        homeph = homePhone;
        cellnum = cellNumber;
    }
    Scanner sc = new Scanner(System.in);

    public void printMenu() {
        System.out.println("***Address Book Menu***");
        System.out.println("1. Add a person to the address book.");
        System.out.println("2. See if a person is in the address book.");
        System.out.println("3. View contacts in the address book.");
        System.out.println("4. Terminate the program.");
        int answer = sc.nextInt();
        switch (answer) {
            case 1:
                  getaddress();
                  printMenu();
                  break;
            case 2: 
                  break;
            case 3:
                print();
                printMenu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Enter a number between 1 and 4.");
                printMenu();
        }
    }

    AddressBook() {
    }

    public void getaddress()
    {
        String first[];
        String last[];
        String home[];
        String phone[];
        String cell[];
        PrintWriter outputStream = null;
        try 
        {
            outputStream = new PrintWriter(new FileOutputStream("out.txt", true));
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("Error opening the fileout.txt.");
            System.exit(0);
        }
        System.out.println("How many contacts do you want to add?");
        int number = sc.nextInt();
        first = new String[number];
        last = new String[number];
        home = new String[number];
        phone = new String[number];
        cell = new String[number];
        for (int i = 0; i < number; i++)
        {
            System.out.println();
            System.out.println("Enter contact "  + " first name:");
            first[i] = sc.next();
            outputStream.println();
            outputStream.println("First name: " + first[i]);
            System.out.println("Enter contact "  + " last name:");
            last[i] = sc.next();
            outputStream.println("Last name: " + last[i]);
            System.out.println("Enter contact " + " home address.");
            home[i] = sc.next();
            outputStream.println("Home Address: " + home[i]);
            System.out.println("Enter contact " + " home phone");
            phone[i] = sc.next();
            outputStream.println("Home Number: " + phone[i]);
            System.out.println("Enter contact " + " cellphone");
            cell[i] = sc.next();
            outputStream.println("Cell Phone Number: " + cell[i]);
            System.out.println();
        }
        outputStream.close();
    }

    public void print() 
    {
        System.out.println("Address Book Contacts");
        File file = new File("C:\\Users\\Divya\\Desktop\\codecamp\\address.txt");
        FileInputStream fis = null;
        DataInputStream dis = null;
        try
        {
            fis = new FileInputStream(file);
            dis = new DataInputStream(fis);
            while (dis.available() != 0)
            {
                System.out.println(dis.read());
            }
            fis.close();
            dis.close();
        } 
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
          catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String ag[])
    {
        AddressBook ab = new AddressBook();
        ab.getaddress();
        ab.printMenu();
        ab.print();
    }
}
