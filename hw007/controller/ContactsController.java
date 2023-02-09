package Homework.hw007.controller;

import java.util.Scanner;

import Homework.hw007.model.contacts.ContactType;
import Homework.hw007.model.user.ContactName;
import Homework.hw007.service.UserContactService;
import Homework.hw007.util.CsvFileRecorder;
import Homework.hw007.view.ContactsView;

public class ContactsController {
    private ContactsView view;
    private UserContactService<String> service;

    public ContactsController(ContactsView view, UserContactService<String> service) {
        this.view = view;
        this.service = service;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number of action:");
            System.out.println("1. Add new contact");
            System.out.println("2. Delete contact");
            System.out.println("3. Show all contact names");
            System.out.println("4. Find a contact by name");
            System.out.println("5. Show all contacts details");
            System.out.println("6. Save contacts to file");
            System.out.println("7. Shut down programm");

            int index = scanner.nextInt();
            switch (index) {
                case 1:
                    System.out.println("Enter contact name, index, contact type and contact details");
                    String name = scanner.nextLine();
                    int id = scanner.nextInt();
                    String contactType = scanner.nextLine();
                    String details = scanner.nextLine();

                    service.addUserContact(new ContactName(name, id),
                            (ContactType<String>) new ContactType<>().setContact(contactType, details));
                    break;

                case 2:
                    System.out.println("Enter contact name, contact id to delete");
                    service.deleteUserContact(new ContactName(scanner.nextLine(), scanner.nextInt(index)));
                    break;
                
                case 3:
                    view.printContactsNames(service);
                    break;

                case 4: 
                    System.out.println("Enter contact name:");
                    view.printOneContact(scanner.nextLine(), service);
                    break;
                
                case 5:
                    view.printAllContacts(service);
                    break;

                case 6:
                    CsvFileRecorder recorder = new CsvFileRecorder();
                    recorder.saveFile(service);
                    break;

                case 7:
                    return;
            }

        }

    }
}
