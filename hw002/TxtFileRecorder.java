package Homework.hw002;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public class TxtFileRecorder extends FileRecorder {

    @Override
    public void saveAs(Map<String, Float> students) {
        try (Writer writer = new FileWriter("Homework/hw002/students.txt",
                false)) {
            students.forEach((key, value) -> {
                try {
                    writer.write(key + " = " + value + "\n");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });

            writer.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
