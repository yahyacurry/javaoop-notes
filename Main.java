import java.util.*;
import java.io.*;

class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void updatePhone(String phone) {
        this.phone = phone;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println("Name: " + name + " | Phone: " + phone + " | Email: " + email);
    }

    // Method to return contact data in CSV format
    public String toCSV() {
        return name + "," + phone + "," + email;
    }
}

//------------------------------------------------------------------------
class ContactBook {
    private List<Contact> contacts;
    private Scanner scanner;

    public ContactBook() {
        contacts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n=== Contact Book ===");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Export to CSV File");
            System.out.println("7. Import From CSV File");
            System.out.println("8. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> searchContact();
                case 4 -> updateContact();
                case 5 -> deleteContact();
                case 6 -> exportToCSV(); // Export to CSV method
                case 7 -> importFromCSV(); // Import from CSV method
                case 8 -> {
                    System.out.println("👋 Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        contacts.add(new Contact(name, phone, email));
        System.out.println("✅ Contact added!");
    }

    private void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        System.out.println("\nContacts:");
        for (Contact contact : contacts) {
            contact.display();
        }
    }

    private void searchContact() {
        System.out.print("Enter name to search: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().contains(keyword)) {
                contact.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ No matching contacts found.");
        }
    }

    private void updateContact() {
        System.out.print("Enter name to update: ");
        String name = scanner.nextLine().toLowerCase();
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().equals(name)) {
                System.out.print("Enter new phone: ");
                contact.updatePhone(scanner.nextLine());
                System.out.print("Enter new email: ");
                contact.updateEmail(scanner.nextLine());
                System.out.println("✅ Contact updated!");
                return;
            }
        }
        System.out.println("❌ Contact not found.");
    }

    private void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = scanner.nextLine().toLowerCase();
        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().toLowerCase().equals(name)) {
                iterator.remove();
                System.out.println("🗑 Contact deleted.");
                return;
            }
        }
        System.out.println("❌ Contact not found.");
    }

    // Method to export contacts to a CSV file
    private void exportToCSV() {
        if (contacts.isEmpty()) {
            System.out.println("❌ No contacts to export.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contacts.csv"))) {
            // Write header
            writer.write("Name,Phone,Email");
            writer.newLine();

            // Write contact details
            for (Contact contact : contacts) {
                writer.write(contact.toCSV());
                writer.newLine();
            }
            System.out.println("✅ Contacts exported to contacts.csv!");
        } catch (IOException e) {
            System.out.println("❌ An error occurred while exporting contacts.");
            e.printStackTrace();
        }
    }

    // Method to import contacts from a CSV file
    private void importFromCSV() {
        File file = new File("contacts.csv");
        if (!file.exists()) {
            System.out.println("❌ No contacts.csv file found.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            reader.readLine(); // Skip the header line (Name,Phone,Email)

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // convert a string into array by comma separating
                if (data.length == 3) {
                    // Create a new Contact object from the data
                    String name = data[0].trim();
                    String phone = data[1].trim();
                    String email = data[2].trim();
                    contacts.add(new Contact(name, phone, email));
                }
            }
            System.out.println("✅ Contacts imported from contacts.csv!");
        } catch (IOException e) {
            System.out.println("❌ An error occurred while importing contacts.");
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContactBook book = new ContactBook();
        book.start();
    }
}
