package Homework.hw007.model.contacts;

import java.util.HashMap;
import java.util.Map;

public class TelegramContactType extends ContactType<String> {

    private Map<String, String> contact;
    
    public TelegramContactType() {
        this.contact = new HashMap<>();
    }

    @Override
    public Map<String, String> getContact() {
        // TODO Auto-generated method stub
        return super.getContact();
    }

    @Override
    public String getContactType() {
        // TODO Auto-generated method stub
        return super.getContactType();
    }

    @Override
    public Map<String, String> setContact(String contactType, String details) {
        
        details = "@" + details;
        contact.put(contactType, details);
        return super.setContact(contactType, details);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.getContactType() + ": @" + super.getContact();
    }
    
}
