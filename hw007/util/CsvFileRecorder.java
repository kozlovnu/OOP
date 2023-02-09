package Homework.hw007.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import Homework.hw007.service.UserContactService;

public class CsvFileRecorder implements FileRecorder <String> {

    @Override
    public void saveFile(UserContactService<String> contact) {
        try (Writer writer = new FileWriter("Homework/hw007/contacts.csv", false)) {
            contact.getUserContacts().forEach((contactName, value) -> {
                try {
                    writer.write(contactName + "\"" + ": \n");
                    Map<String, String> contacts = contact.getUserContacts().get(contactName);
                    for (String contactType : contacts.keySet()){
                        writer.write(contactType + ": , " + contacts.get(contactType).toString() + ", \n");
                    }
                    
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.flush();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
