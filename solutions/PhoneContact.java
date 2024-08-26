import java.util.HashMap;

// Phone contacts application
//
//An application that allows users to store and manage their contacts' information efficiently.
//add contact, remove contact, get contact phone number, show all contacts
//Only name and phone number should be saved
public class PhoneContact {

    HashMap<String, String> contacts = new HashMap<>();

    // Method to add contact
    // Collect parameters from users [ name] and [number]
    // Check if [name] - key already included in the hashmap
    // If name exist, inform user to change the name
    // add to the hashmap if name doesn't exist
    // print success message
    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            System.out.println("Name already exist");
        } else {
            contacts.put(name, phoneNumber);
            System.out.println("Name added successfully");
        }
    }


    // Method to remove contact
    // Collect parameters from users [name] as key
    // Search the store for the key
    // If name doesn't exist in store, inform user or else inform user
    // print success message
    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact removed successfully");
        } else {
            System.out.println("Contact not found");
        }

    }


    // Method to get a contact
    // Collect parameters from users [ Name ]
    // Search the store using name as key and return the value if found
    // else print not found for user
    public void getAContact(String name){
        System.out.println(contacts.getOrDefault(name, "Contact not found"));
    }


    // Method to get all contact
    // print out all keys and value from the store
    public void getAllContacts() {
        for (String i : contacts.keySet()) {
            System.out.println("Name: " + i + " PhoneNumber: " + contacts.get(i));
        }
    }
}
