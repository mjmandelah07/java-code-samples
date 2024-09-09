public class Usage {
    public static void main(String[] args) {
        PhoneContact myContacts = new PhoneContact();
        myContacts.addContact("Mojisola", "08167065373");
        myContacts.addContact("Sola", "08167065374");
        myContacts.getAContact("Mojisola");
        myContacts.removeContact("Sola");
        myContacts.getAllContacts();

        Testing.sum(3, 5);
    }
}
