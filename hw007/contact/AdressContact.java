package Homework.hw007.contact;

import java.util.HashMap;
import java.util.Map;

public class AdressContact extends Contact{

    private String contactType = "adress";
    private String adress;
    
    private Map <String, String> contact = new HashMap<>();
    public AdressContact(String adress, Map<String, String> contact) {
        this.adress = adress;
        this.contact = contact;
    }

    

}
