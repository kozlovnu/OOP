package Homework.hw007.task007;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdressContacType extends ContactType {
    private String contactType = "adress";
    List<String> detailsList;
    private Map<String, List<String>> contact;


    public AdressContacType() {
        this.detailsList = detailsList;
        this.contact = contact;
    }

    @Override
    public void setContactDetails(String contactDetails) {
        // TODO Auto-generated method stub
        super.setContactDetails(contactDetails);
    }

    @Override
    public Map<String, List<String>> getContact() {
        // TODO Auto-generated method stub
        return super.getContact();
    }

    @Override
    public String getContactType() {
        // TODO Auto-generated method stub
        return super.getContactType();
    }

    @Override
    public List<String> getDetailsList() {
        // TODO Auto-generated method stub
        return super.getDetailsList();
    }

    @Override
    public Map<String, List<String>> setContact(String details) {
        // TODO Auto-generated method stub
        return super.setContact(details);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
