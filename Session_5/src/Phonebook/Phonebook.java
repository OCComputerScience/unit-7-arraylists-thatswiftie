package Phonebook;
import java.util.ArrayList;
import java.util.Arrays;

public class Phonebook
{
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact)
    {
        contacts.add(contacts.size(), contact);
        sort();
    }

    public void sort()
    {
        for(int i = 1; i < contacts.size(); i++)
        {
            Contact currentContact =  contacts.get(i);
            int currIndex = i - 1;

            while((currIndex >= 0) && currentContact.getName().compareTo(contacts.get(currIndex).getName()) < 0)
            {
                contacts.set(currIndex+1, contacts.get(currIndex));
                currIndex--;
            }

            contacts.set(currIndex + 1, currentContact);
        }
    }

    public void printPhonebook()
    {
        for(int i = 0; i < contacts.size(); i++)
        {
            System.out.println(contacts.get(i).getName());
        }
    }

}
