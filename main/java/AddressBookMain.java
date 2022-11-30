import java.util.Scanner;

public class AddressBookMain {

    Scanner scanner = new Scanner(System.in);
    public void chooseOption()
    {
        AddressBook addressBookService = new AddressBook();

        boolean isExit = false;
        while (!isExit)
        {
            System.out.print("Enter Number As Per Your Choice:\n1.Add-New Contacts:\n2.Display-All Records:\n3.Edit Contact:" +
                    "\n4.Delete Contact\n5.Exit:\n");
            int userInput = scanner.nextInt();
            switch (userInput)
            {
                case 1:
                    //add new contact.
                    addressBookService.addDetails();
                    break;
                case 2:
                    //display all contact.
                    addressBookService.displayContacts();
                    break;
                case 3:
                    //edit existing contact.
                    addressBookService.editContact();
                    break;
                case 4:
                    //delete existing contact.
                    addressBookService.deleteContact();
                    break;
                case 5:
                    //Search for person in state or city
                    addressBookService.SearchPersonInACityOrState();
                    break;
                case 6:
                    //Search by Phone number
                    addressBookService.GetNumberOfContacts();
                    break;
                case 7:
                    //Sort by first name
                    addressBookService.SortContactByFirstName();
                    break;
                case 8:
                    //Sort by Zip
                    addressBookService.SortByZipCode();
                    break;
                case 9:
                    //For io file read write create
                    addressBookService.fileCreate();
                    addressBookService.fileReader();
                    addressBookService.fileWrite();
                    break;

                case 10:
                    //Exit from program.
                    isExit = true;
                    break;
                default:
                    System.out.println("Please enter valid input");
            }

        }
    }

    public static void main(String[] args)
    {
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.chooseOption();
    }

}