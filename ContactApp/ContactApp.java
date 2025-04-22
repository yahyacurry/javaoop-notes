package ContactApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactApp {
    List<Contact> contacts;
    Scanner scanner = new Scanner(System.in);
    int userRespnse;

    public ContactApp(){
        this.contacts = new ArrayList<>();
    }

    public void addContact(String Name, String phoneNumber, String emailAdress){
        contacts.add(new Contact(Name, phoneNumber, emailAdress));
        if (!emailAdress.contains("@")){
            System.out.println("Invalid Email Adress");
        }
        System.out.println("Successfully added Contact");


    }
    public void viewContact(){
        if (contacts.isEmpty()){
            System.out.println("No contacts to view");
        }
        for (int i = 0; i <contacts.size(); i++){
            System.out.println("[" + (i + 1) + "] " + contacts.get(i));

        }
    }

    public void searchContact(String contactName){
        for (int i = 0; i < contacts.size(); i++){
                if (contacts.get(i).getName().equals(contactName)){
                    System.out.println(contacts.get(i));
                    return;
                }
        }
        System.out.println("No Contacts Found");
    }

    public void deleteContact(String deletedName){
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getName().equals(deletedName)){
                contacts.remove(deletedName);
                return;
            }
        }

    }


    public void updateContact(int remove){
        scanner.nextLine();
        System.out.println("Update your name: ");
        String updatedName = scanner.nextLine();
        System.out.println("Update your phone number");
        String updatedPhoneNumber = scanner.nextLine();
        System.out.println("Update your email adress");
        String updatedEmailAdress = scanner.nextLine();
        contacts.add(new Contact(updatedName,updatedPhoneNumber,updatedEmailAdress));
        contacts.remove(remove);
    }

    public void display(){
        System.out.println("Please choose one: ");
        System.out.println("1. Add new contacts");
        System.out.println("2. View all contacts");
        System.out.println("3. Search contacts by name");
        System.out.println("4. Delete contacts");
        System.out.println("5. Update contact information");
        System.out.println("6. Exit");
        int response = scanner.nextInt();
        scanner.nextLine();
        switch (response){
            case 1 -> {
                System.out.println("Add Contact Name");
                String contactName = scanner.nextLine();
                System.out.println("Add Contact Phone number");
                String contactPhoneNumber = scanner.nextLine();
                System.out.println("Add Contact Email Adress");
                String contactEmailAdress = scanner.nextLine();
                contacts.add(new Contact(contactName,contactPhoneNumber,contactEmailAdress));
                System.out.println("SuccessFully Added");
            }
            case 2->{
                viewContact();
            }
            case 3->{
                System.out.println("Please provide the contact name you would like to search");
                String search = scanner.nextLine();
                searchContact(search);
            }
            case 4 ->{
                System.out.println("Provide the name for which contact you want to remove");
                String name = scanner.nextLine();
                deleteContact(name);
                System.out.println("SuccessFully deleted");
            }
            case 5 -> {
                System.out.println("Which contact do you want to update provide the number");
                userRespnse = scanner.nextInt();
                updateContact(userRespnse);
            }
            case 6 -> {
                System.out.println("Bye");
                return;
            }

        }




    }

    public static void main(String[] args) {
        ContactApp contact1 = new ContactApp();
        while (true) {


            contact1.display();
        }
    }


}
