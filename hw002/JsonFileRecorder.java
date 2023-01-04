package Homework.hw002;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public class JsonFileRecorder extends FileRecorder {

    @Override
    public void saveAs(Map<String, Float> students) {
        try (Writer writer = new FileWriter("Homework/hw002/students.json", false)) {
            writer.write("{\n");
            students.forEach((key, value) -> {
                try {
                    writer.write("\"" + key + "\"" + ": " + value + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.write("}\n");
            writer.flush();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
