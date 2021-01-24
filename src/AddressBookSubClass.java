import java.util.Scanner;

public class AddressBookSubClass  {

    public static void editContactDetails(String first_Name, AddressBookMain[] addressBookMainArray) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < addressBookMainArray.length; i++) {
            try {
                if ((addressBookMainArray[i].first_Name).equals(first_Name)) {
                    System.out.println("CHOOSE OPTIONS TO EDIT\n 1:FIRST NAME\n 2:LAST NAME\n 3:ADDRESS\n 4:CITY \n 5:STATE\n 6:ZIP CODE\n 7:PHONE NUMBER\n 8:EMAIL ID");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("ENTER THE NEW FIRST NAME");
                            addressBookMainArray[i].first_Name = scanner.next();
                            System.out.println("ADDRESS BOOK CONTACT DETAILS AFTER EDITING:");
                            addressBookMainArray[i].displayContacts();
                            break;
                        case 2:
                            System.out.println("ENTER THE NEW LAST NAME");
                            addressBookMainArray[i].last_Name = scanner.next();
                            System.out.println("ADDRESS BOOK CONTACT DETAILS AFTER EDITING:");
                            addressBookMainArray[i].displayContacts();
                            break;
                        case 3:
                            System.out.println("ENTER THE NEW ADDRESS");
                            addressBookMainArray[i].address = scanner.next();
                            System.out.println("ADDRESS BOOK CONTACT DETAILS AFTER EDITING:");
                            addressBookMainArray[i].displayContacts();
                            break;
                        case 4:
                            System.out.println("ENTER THE CITY");
                            addressBookMainArray[i].city = scanner.next();
                            System.out.println("ADDRESS BOOK CONTACT DETAILS AFTER EDITING:");
                            addressBookMainArray[i].displayContacts();
                            break;
                        case 5:
                            System.out.println("ENTER THE NEW STATE");
                            addressBookMainArray[i].state = scanner.next();
                            System.out.println("ADDRESS BOOK CONTACT DETAILS AFTER EDITING:");
                            addressBookMainArray[i].displayContacts();
                            break;
                        case 6:
                            System.out.println("ENTER THE NEW ZIP CODE");
                            addressBookMainArray[i].zip_Code = scanner.next();
                            System.out.println("ADDRESS BOOK CONTACT DETAILS AFTER EDITING:");
                            addressBookMainArray[i].displayContacts();
                            break;
                        case 7:
                            System.out.println("ENTER THE NEW PHONE NUMBER");
                            addressBookMainArray[i].phone_Number = scanner.next();
                            System.out.println("ADDRESS BOOK CONTACT DETAILS AFTER EDITING:");
                            addressBookMainArray[i].displayContacts();
                            break;
                        case 8:
                            System.out.println("ENTER THE NEW EMAIL ID");
                            addressBookMainArray[i].email_Id = scanner.next();
                            System.out.println("ADDRESS BOOK CONTACT DETAILS AFTER EDITING:");
                            addressBookMainArray[i].displayContacts();
                            break;
                    }
                }
            }catch (Exception e) {
                continue;
            }
        }
    }


}

