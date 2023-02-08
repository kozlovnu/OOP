package Homework.hw007.task007.model.contacts;

import java.util.Map;

public class VkPageContactType extends ContactType<String> {

    @Override
    public Map<String, String> getContact() {
        return super.getContact();
    }

    @Override
    public String getContactType() {
        return super.getContactType();
    }

    @Override
    public Map<String, String> setContact(String contactType, String details) {
        details = "https://vk.com/" + details;
        // super.getContact().put(contactType, details);
        return super.setContact(contactType, details);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
