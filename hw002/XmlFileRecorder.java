package Homework.hw002;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public class XmlFileRecorder extends FileRecorder {

    @Override
    public void saveAs(Map<String, Float> students) {
        try (Writer writer = new FileWriter("Homework/hw002/students.xml",
                false)) {
            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
            writer.write("<students>\n");

            students.forEach((key, value) -> {
                try {
                    writer.write("<student>\n");
                    writer.write("<name>" + key + "</name>\n" + "<grade>" + value + "</grade>\n");
                    writer.write("</student>\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.write("</students>\n");

            writer.flush();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
